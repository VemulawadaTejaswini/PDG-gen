import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static			BufferedReader	br = null;
	private	static	final	int[]			AI = { 0, 90, 180, 270 };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]	bd = parseBoard();

		showBoard(bd, 1);
		showBoard(bd, 2);
		showBoard(bd, 3);
	}
 
	private static void showBoard(char[][] bd, int ai) {
		System.out.println(AI[ai]);
		for (int i = 0; i < 8; i++) {
			String	out = "";
			for (int j = 0; j < 8; j++) {
				switch (ai) {
				case	1:
					out += bd[7-j][i];
					break;
				case	2:
					out += bd[7-i][7-j];
					break;
				case	3:
					out += bd[j][7-i];
					break;
				default:
					out += bd[i][j];
					break;
				}
			}
			System.out.println(out);
		}
	}

	private static char[][] parseBoard() {
		char[][]	bd = new char[8][];

		for (int i = 0; i < bd.length; i++) {
			bd[i] = parseStdin().toCharArray();
		}

		return bd;
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