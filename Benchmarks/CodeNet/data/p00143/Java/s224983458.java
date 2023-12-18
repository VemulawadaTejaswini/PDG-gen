import java.awt.Polygon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
		int	num = parseNum();

		for (int i = 0; i < num; i++) {
			solve(parsePos());
		}
	}

	private static void solve(int[][] pos) {
		Polygon	tri = new Polygon();

		for (int i = 0; i < 3; i++) {
			tri.addPoint(pos[i][0], pos[i][1]);
		}

		if (tri.contains(pos[3][0], pos[3][1]) != tri.contains(pos[4][0], pos[4][1])) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}

	private static int[][] parsePos() {
		int[][]	pos = null;
		String	str = null;

		if ((str = parseStdin()) != null) {
			String[]	lns = str.split(" ");

			pos = new int[5][2];
			for (int i = 0; i < pos.length; i++) {
				pos[i][0] = Integer.parseInt(lns[i*2]);
				pos[i][1] = Integer.parseInt(lns[i*2+1]);
			}
		}
 
		return pos;
	}

	private static int parseNum() {
		int		param = 0;
		String	strin = null;

		if ((strin = parseStdin()) != null) {
			param = Integer.parseInt(strin);
		}
 
		return param;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) {
            		stdin = tmp;
            	}
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}