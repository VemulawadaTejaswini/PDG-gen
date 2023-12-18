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
		if (isInner(pos[0], pos[1], pos[2], pos[3]) != isInner(pos[0], pos[1], pos[2], pos[4])) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}

	private static boolean isInner(int[] ia, int[] ib, int[] ic, int[] ip) {
        int	n1 = getCrossSign(ia, ib, ip);
        int	n2 = getCrossSign(ib, ic, ip);
        int	n3 = getCrossSign(ic, ia, ip);

        return ((n1 == n2) && (n2 == n3));
	}
 
	private static int getCrossSign(int[] ia, int[] ib, int[] ip) {
		int[]    iab = { ib[0] - ia[0], ib[1] - ia[1] };
		int[]    iap = { ip[0] - ia[0], ip[1] - ia[1] };
		return ( getCross(iab, iap) >= 0 ) ? 1 : -1;
	}
 
	private static double getCross(int[] iab, int[] iap) {
		return iab[0] * iap[1] - iab[1] * iap[0];   // x1*x2 + y1*y2
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