import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map			bd = null;
		boolean[]	rs = new boolean[(1<<10)];

		while ((bd = parseBoard()) != null) {
			int	bc = 0;

			if ((bc = parseCnt()) > 0) {
				Map[]	pc = new Map[bc];
				int		hc = 0;
				for (int i = 0; i < bc; i++) {
					pc[i] = parsePiece();
				}
				solve(bd, pc, 0, 0, rs);

				if ((hc = parseCnt()) > 0) {
					while (hc-- > 0) {
						System.out.println(rs[parsePattern()] ? "YES" : "NO");
					}
				}

				Arrays.fill(rs, false);
			}
		}
	}
 
	private static void solve(Map bd, Map[] pc, int upc, int filled, boolean[] rs) {
		if (bd.sz == filled) {
			// 全部の空き地が埋まったら正解
			rs[upc] = true;
			return;
		}

		for(int i = 0; i < bd.ln[0][0]; i++) {
			for(int j = 0; j < bd.ln[0][1]; j++) {
				if ((bd.mp[0][i] & (1<<(30-j))) != 0) {
					boolean	isMatchAny = false;

					for (int k = 0; k < pc.length; k++) {
						// 一度使ったピースは除外
						if ((upc & 1<<k) != 0) continue;

						// ピースの面積が空き地の面積を超える場合は除外
						if (bd.sz < filled+pc[k].sz) continue;

						for (int l = 0; l < pc[k].mp.length; l++) {
							if (pc[k].mp[l] != null) {
								int	xs = pc[k].st[l][1];
								int	xe = bd.ln[0][1]-pc[k].ln[l%pc[k].ln.length][1]+pc[k].st[l][1];
								int	ys = pc[k].st[l][0];
								int	ye = bd.ln[0][0]-pc[k].ln[l%pc[k].ln.length][0]+pc[k].st[l][0];
								int	dj = j-pc[k].st[l][1];
								int	di = i-pc[k].st[l][0];

								// ピースが置ける範囲内にある場合はマッチング
								if (xs <= j && j <= xe && ys <= i && i <= ye) {
									boolean	isMatch = true;

									for (int m = 0; m < pc[k].ln[l%pc[k].ln.length][0]; m++) {
										if ((bd.mp[0][di+m] & (pc[k].mp[l][m]>>dj)) != (pc[k].mp[l][m]>>dj)) {
											// ピースが合わない場合はマッチングを打ち切り
											isMatch = false;
											break;
										}
									}

									if (isMatch) {
										isMatchAny = true;
										putPiece(j, i, l, bd, pc[k], false);
										solve(bd, pc, upc | 1<<k, filled+pc[k].sz, rs);
										putPiece(j, i, l, bd, pc[k], true);
									}
								}
							}
						}
					}

					if (!isMatchAny) {
						return;
					}
				}
			}
		}
	}

	private static void putPiece(int x, int y, int l, Map bd, Map pc, boolean rm) {
		int	dx = x-pc.st[l][1];
		int	dy = y-pc.st[l][0];
		for (int i = 0; i < pc.ln[l%pc.ln.length][0]; i++) {
			if (rm) {
				bd.mp[0][dy+i] |= pc.mp[l][i]>>dx;
			} else {
				bd.mp[0][dy+i] &= ~(pc.mp[l][i]>>dx);
			}
		}
	}

	private static int parsePattern() {
		int		pt    = 0;
        String	stdin = null;

        if ((stdin = parseStdin()) != null) {
        	String[]	lines = stdin.split(" ");
        	int			max   = Integer.parseInt(lines[0]);
        	for (int i = 1; i <= max; i++) {
        		pt |= 1<<(Integer.parseInt(lines[i])-1);
        	}
        }
 
        return pt;
	}

	private static int[] parseSize() {
		int[]	sz    = null;
        String	stdin = null;

        if ((stdin = parseStdin()) != null) {
        	if (!stdin.equals("0 0")) {
            	String[]	lines = stdin.split(" ");
            	sz    = new int[2];
            	sz[0] = Integer.parseInt(lines[0]);
            	sz[1] = Integer.parseInt(lines[1]);
        	}
        }
 
        return sz;
	}

	private static Map parseBoard() {
		Map		bd = null;
		int[]	sz = parseSize();

		if (sz != null) {
			bd = new Map();
			bd.mp = new int[1][sz[0]];
			bd.ln = new int[1][];
			bd.ln[0] = sz;

			for (int i = 0; i < sz[0]; i++) {
				String	line  = null;
		        if ((line = parseStdin()) != null) {
		        	for (int j = 0; j < sz[1]; j++) {
		        		if (line.charAt(j) == '.') {
			        		bd.mp[0][i] |= (1<<(30-j));
			        		bd.sz++;
		        		}
		        	}
		        }
			}
		}

		return bd;
	}

	private static Map parsePiece() {
		Map		bd = null;
		int[]	ln = parseSize();
		int[]	wk = null;
		int[]	st = null;
		boolean	fn = false;

		if (ln != null) {
			bd = new Map();
			bd.mp = new int[4][];
			bd.st = new int[4][];
			if (ln[0] != ln[1]) {
				bd.ln = new int[2][2];
				bd.ln[0][0] = bd.ln[1][1] = ln[0];
				bd.ln[0][1] = bd.ln[1][0] = ln[1];
			} else {
				bd.ln = new int[1][2];
				bd.ln[0][0] = ln[0];
				bd.ln[0][1] = ln[1];
			}

			// 0度
			if (!fn) {
				wk = new int[bd.ln[0][0]];
				st = null;

				for (int i = 0; i < wk.length; i++) {
					String	line  = null;
			        if ((line = parseStdin()) != null) {
			        	for (int j = 0, k = line.indexOf("#", j); k != -1; k = line.indexOf("#", k+1)) {
			        		if (st == null) {
			        			st = new int[2];
			        			st[0] = i;
			        			st[1] = k;
			        		}
			        		wk[i] |= (1<<(30-k));
			        		bd.sz++;
			        	}
			        }
				}

				bd.mp[0] = wk;
				bd.st[0] = st;
			}

			// 90度
			if (!fn) {
				wk = new int[bd.ln[0][1%bd.ln.length]];
				st = null;
				fn = (ln[0] != ln[1]) ? false : true;

				for (int i = 0; i < wk.length; i++) {
		        	for (int j = 0; j < bd.ln[0][0]; j++) {
		        		if ((bd.mp[0][bd.ln[0][0]-j-1] & (1<<(30-i))) != 0) {
			        		if (st == null) {
			        			st = new int[2];
			        			st[0] = i;
			        			st[1] = j;
			        		}
			        		wk[i] |= (1<<(30-j));
		        		}
		        	}
		        	fn = (fn) ? bd.mp[0][i] == wk[i] : false;
				}

				if (!fn) {
					bd.mp[1] = wk;
					bd.st[1] = st;
				}
			}

			// 180度
			if (!fn) {
				wk = new int[bd.mp[0].length];
				st = null;
				fn = true;

				for (int i = 0; i < wk.length; i++) {
		        	for (int j = 0; j < bd.ln[0][1]; j++) {
		        		if ((bd.mp[0][wk.length-1-i] & (1<<(30-(bd.ln[0][1]-1-j)))) != 0) {
			        		if (st == null) {
			        			st = new int[2];
			        			st[0] = i;
			        			st[1] = j;
			        		}
			        		wk[i] |= (1<<(30-j));
		        		}
		        	}
		        	fn = (fn) ? bd.mp[0][i] == wk[i] : false;
				}

				if (!fn) {
					bd.mp[2] = wk;
					bd.st[2] = st;
				}
			}

			// 270度
			if (!fn) {
				wk = new int[bd.mp[1].length];
				st = null;
				fn = true;

				for (int i = 0; i < wk.length; i++) {
		        	for (int j = 0; j < bd.ln[0][0]; j++) {
		        		if ((bd.mp[1][wk.length-1-i] & (1<<(30-(bd.ln[0][0]-1-j)))) != 0) {
			        		if (st == null) {
			        			st = new int[2];
			        			st[0] = i;
			        			st[1] = j;
			        		}
			        		wk[i] |= (1<<(30-j));
		        		}
		        	}
		        	fn = (fn) ? bd.mp[1][i] == wk[i] : false;
				}

				if (!fn) {
					bd.mp[3] = wk;
					bd.st[3] = st;
				}
			}
		}

		return bd;
	}

	private static int parseCnt() {
		int     cnt = 0;
		String  str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
	}
 
	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (!tmp.isEmpty()) stdin = tmp;
        }
        catch (IOException e) {}
 
        return stdin;
	}
}

class Map {
	int[][]	mp = null;
	int[][]	ln = null;
	int[][]	st = null;
	int		sz = 0;
}