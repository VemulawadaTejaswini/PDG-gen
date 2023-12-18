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
		int[]	tbl = new int[100+1];
		int		num = 0;

		while((num = parseNum()) != 0) {
			for (int i = 0; i <= num; i++) {
				tbl[i] = parseNum();
			}
			solve(tbl, num);
		}
	}

	private static void solve(int[] tbl, int num) {
		int	key = tbl[num];
		int	cmp = 0;
		int	l   = 0;
		int	r   = num-1;

		while (l <= r) {
			int	m = (l+r)/2;
			cmp++;
			if (key == tbl[m]) {
				break;
			} else if (key > tbl[m]) {
				l = m+1;
			} else {
				r = m-1;
			}
		}

		System.out.println(cmp);
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