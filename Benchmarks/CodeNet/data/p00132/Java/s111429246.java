import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.Calendar.Builder;

import javax.jws.soap.SOAPBinding.Use;



public class Main {
	static int H;
	static int W;
	static int[] map;
	static Piece[] p;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		//Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if(H == 0 && W == 0) break;
			map = new int[H];
			int sy = 0;
			int sx = 0;
			int mapCount = 0;
			char[][] MM = new char[H][W];
			for(int i = 0; i < H; i++) {
				String in = sc.next();
				MM[i] = in.toCharArray();
				in = in.replace('.', '0');
				in = in.replace('#', '1');
				int bin = Integer.parseInt(in,2);
				map[i] = bin;
				mapCount += W - Integer.bitCount(bin);
			}
			IN:for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(MM[i][j] == '.') {
						sy = i;
						sx = j;
						break IN;
					}
				}
			}
			int n = sc.nextInt();
			p = new Piece[n];
			for(int i = 0; i < n; i++) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				String[] map = new String[h];
				for(int j = 0; j < h; j++) {
					String in = sc.next();
					map[j] = in;
				}
				p[i] = new Piece(h,w,map);
			}
			
			int p = sc.nextInt();
			for(int i = 0; i < p; i++) {
				int k = sc.nextInt();
				int[] t = new int[k];
				for(int j = 0; j < k; j++) {
					t[j] = sc.nextInt()-1;
				}
				int bitCount = 0;
				for(int j = 0; j < k; j++) {
					for(int l = 0; l < Main.p[t[j]].h[0]; l++) {
						bitCount += Integer.bitCount(Main.p[t[j]].map[0][l]);
					}
				}
				boolean ans = false;
				if(bitCount == mapCount) {
					ans = check(new boolean[k],t,map,sy,sx,0);
				}
				if(ans) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
	static boolean check(boolean[] used, int[] use, int[] map, int y, int x,int c) {
		if(x == W) return check(used,use,map,y+1,0,c);
		if(y == H && c == use.length) {
			return true;
		}
		else if(y == H) return false;
		if((map[y] & (1 << (W - x - 1))) == 0) {
			for(int i = 0; i < use.length; i++) {
				if(used[i]) continue;
				int sel = use[i];
				for(int j = 0; j < 4; j++) {
					int xx = x - p[sel].vw[j];
					if(xx < 0) continue;
					boolean cf = checkCanFill(y,xx,j,map,p[sel]);
					if(!cf) continue;
					fill(y,xx,j,map,p[sel]);
					used[i] = true;
					boolean rt = check(used,use,map,y,x+1,c+1);
					if(rt) {
						used[i] = false;
						fill(y,xx,j,map,p[sel]);
						return true;
					}
					used[i] = false;
					fill(y,xx,j,map,p[sel]);
				}
			}
			return false;
		}
		else {
			return check(used,use,map,y,x+1,c);
		}
	}
	static boolean checkCanFill(int A, int B, int C,int[] map, Piece p) {
		if(p.h[C] + A > H) return false;
		if(p.w[C] + B > W || W - p.w[C] - B < 0) return false;
		for(int i = 0; i < p.h[C]; i++) {
			if((map[i + A] & (p.map[C][i] << (W - p.w[C] - B))) != 0) return false;
		}
		return true;
	}
	static void fill(int A, int B, int C, int[] map, Piece p) {
		for(int i = 0; i < p.h[C]; i++) {
			map[i + A] ^= (p.map[C][i] << (W - p.w[C] - B));
		}
	}
	static boolean checkFill(int[] map) {
		for(int i = 0; i < H; i++) {
			if(map[i] != (1 << W)-1) return false;
		}
		return true;
	}
	
	static String[] rotate(String[] map) {
		char[][] in = new char[map.length][];
		for(int i = 0; i < map.length; i++) {
			in[i] = map[i].toCharArray();
		}
		char[][] ret = new char[in[0].length][in.length];
		for(int i = 0; i < in[0].length; i++) {
			for(int j = 0; j < in.length; j++) {
				ret[i][j] = in[in.length - j - 1][i];
			}
		}
		String[] retu = new String[ret.length];
		for(int i = 0; i < ret.length; i++) {
			retu[i] = String.valueOf(ret[i]);
		}
		return retu;
		
	}
	
	
	static class Piece {
		int[] h;
		int[] w;
		int[][] map;
		int[] vw;
		Piece(int a, int b, String[] c) {
			h = new int[4];
			w = new int[4];
			vw = new int[4];
			map = new int[4][];
			for(int i = 0; i < 4; i++) {
				h[i] = a;
				w[i] = b;
				map[i] = new int[h[i]];
				for(int j = 0; j < w[i]; j++) {
					if(c[0].charAt(j) == '#') {
						vw[i] = j;
						break;
					}
				}
				for(int j = 0; j < h[i]; j++) {
					String in = c[j];
					in = in.replace('.', '0');
					in = in.replace('#', '1');
					int bin = Integer.parseInt(in,2);
					map[i][j] = bin;
				}
				int tmp = a;
				a = b;
				b = tmp;
				c = rotate(c);
			}
		}
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