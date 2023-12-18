import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007L;
	static final int[] vx_4 = {1,0,-1,0};
	static final int[] vy_4 = {0,1,0,-1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};
	
	static int idx;
	static char[][] str;
	static int lv;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true){
		int N = sc.nextInt();
		if(N == 0) break;
		int[] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		int[][][][][][] count = new int[N+1][6][3][6][3][6];
		int[][][][][][] sum   = new int[N+1][6][3][6][3][6];
		for(int i = 0; i < count.length; i++) {
			for(int j = 0; j < count[i].length; j++) {
				for(int k = 0; k < count[i][j].length; k++) {
					for(int l = 0; l < count[i][j][k].length; l++) {
						for(int m = 0; m < count[i][j][k][l].length; m++) {
							Arrays.fill(count[i][j][k][l][m], -1);
							Arrays.fill(sum[i][j][k][l][m], INF);
						}
					}
				}
			}
		}
		count[0][0][0][0][0][0] = 0;
		sum[0][0][0][0][0][0] = 0;
		for(int i = 0; i < count.length-1; i++) {
			for(int j = 0; j < count[i].length; j++) {
				for(int k = 0; k < count[i][j].length; k++) {
					for(int l = 0; l < count[i][j][k].length; l++) {
						for(int m = 0; m < count[i][j][k][l].length; m++) {
							for(int n = 0; n < count[i][j][k][l][m].length; n++) {
								if(count[i][j][k][l][m][n] == -1) continue;
								if(count[i+1][j][k][l][m][n] < count[i][j][k][l][m][n] || (count[i+1][j][k][l][m][n] == count[i][j][k][l][m][n] && sum[i+1][j][k][l][m][n] > sum[i][j][k][l][m][n]) || count[i+1][j][k][l][m][n] == -1) {
									count[i+1][j][k][l][m][n] = count[i][j][k][l][m][n];
									sum[i+1][j][k][l][m][n] = sum[i][j][k][l][m][n];
								}
								IN100:for(int use100 = 0; use100 <= j; use100++) {
									IN50:for(int use50 = 0; use50 <= k; use50++) {
										IN10:for(int use10 = 0; use10 <= l; use10++) {
											IN5:for(int use5 = 0; use5 <= m; use5++) {
												IN1:for(int use1 = 0; use1 <= n; use1++) {
													int tmp = use100 * 100 + use50 * 50 + use10 * 10 + use5 * 5 + use1;
													while(p[i] > tmp) tmp += 1000;
													int[] o2 = check(tmp - p[i]);
													int n500 = count[i][j][k][l][m][n] + o2[1];
													int n100 = o2[2] + j - use100;
													int n50  = o2[3] + k - use50;
													int n10  = o2[4] + l - use10;
													int n5   = o2[5] + m - use5;
													int n1   = o2[6] + n - use1;
													if(n100 >= 6) continue IN100;
													if(n50  >= 3) continue IN50;
													if(n10 >= 6) continue IN10;
													if(n5  >= 3) continue IN5;
													if(n1  >= 6) continue IN1;
													if(count[i+1][n100][n50][n10][n5][n1] < n500 || (count[i+1][n100][n50][n10][n5][n1] == n500 && sum[i+1][n100][n50][n10][n5][n1] > sum[i][j][k][l][m][n] + p[i]) || count[i+1][n100][n50][n10][n5][n1] == -1) {
														count[i+1][n100][n50][n10][n5][n1] = n500;
														sum[i+1][n100][n50][n10][n5][n1] = sum[i][j][k][l][m][n] + p[i];
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		int ans = -1;
		int su = INF;
		for(int j = 0; j < count[N].length; j++) {
			for(int k = 0; k < count[N][j].length; k++) {
				for(int l = 0; l < count[N][j][k].length; l++) {
					for(int m = 0; m < count[N][j][k][l].length; m++) {
						for(int n = 0; n < count[N][j][k][l][m].length; n++) {
							if(ans < count[N][j][k][l][m][n] || (ans == count[N][j][k][l][m][n] && su > sum[N][j][k][l][m][n])) {
								ans = count[N][j][k][l][m][n];
								su  = sum[N][j][k][l][m][n];
							}
						}
					}
				}
			}
		}
		System.out.println(ans + " " + su);
	}
	}
	static int[] check(int a) {
		int[] o2 = new int[7];
		while(a >= 1000) {
			o2[0]++;
			a -= 1000;
		}
		while(a >= 500) {
			o2[1]++;
			a -= 500;
		}
		while(a >= 100) {
			o2[2]++;
			a -= 100;
		}
		while(a >= 50) {
			o2[3]++;
			a -= 50;
		}
		while(a >= 10) {
			o2[4]++;
			a -= 10;
		}
		while(a >= 5) {
			o2[5]++;
			a -= 5;
		}
		while(a >= 1) {
			o2[6]++;
			a -= 1;
		}
		return o2;
	}
		
	
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
    	if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}