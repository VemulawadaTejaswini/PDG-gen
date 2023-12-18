import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
	// ??\??????
	static int w, h;
	static String field[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		//
		for (int i = 0; i < w * h; i++) {
			String target = getTarget();
			//"."??\??????????????????????????£?????????????????????
			if (target == null) {
				System.out.println(res);
			}
			// ?????????????????¨?????¢?????????????????????
			for (int x = 0; x < w; x++) {
				for (int y = 0; y < h; y++) {
					if (field[x][y].equals(target)) {
						dfs(x, y);
						res++;
					}
				}
			}
		}
	}

	// "."??????????????°?????????????????¢???
	static String getTarget() {
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				if (field[x][y] != ".") {
					return field[x][y];
				}
			}
		}
		return null;
	}

	// ?????¨??????x,y ?°´????????????????????¨????????§?????°????????¢??°
	static void dfs(int x, int y) {
		// ???????????¨?????????.?????????
		field[x][y] = ".";
		// 8?????????*????????????
		for (int dx = x - 1; dx < x + 1; dx++) {
			for (int dy = y - 1; dy < y + 1; dy++) {
				if (field[dx][dy] == "W") {
					field[dx][dy] = ".";
				}
			}
		}
	}

}


//??\?????¨????????????
class FastReader{
    private InputStream in = System.in;
    private byte[] buf = new byte[1024];
    private int charNum;
    private int charLen;
    private StringBuilder sb = new StringBuilder();
 
    public int read() {
        if (charLen == -1) throw new InputMismatchException();
        if (charNum >= charLen) {
            charNum = 0;
            try {
                charLen = in.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (charLen <= 0) return -1;
        }
        return buf[charNum++];
    }
 
    public String next() {
        int c = read();
        while (isWhitespace(c)) {
            c = read();
        }
        sb.setLength(0);
        do {
            sb.appendCodePoint(c);
            c = read();
        } while (!isWhitespace(c));
        return sb.toString();
    }
 
    public char[] nextCharArray() {
        return next().toCharArray();
    }
 
    public char[][] nextCharArray2d(int lines, int rows) {
        char[][] array = new char[lines][rows];
        for (int i = 0; i < lines; i++)
            array[i] = nextCharArray();
        return array;
    }
 
    public int nextInt() {
        return Integer.valueOf(next());
    }
 
    public boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}