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
		int	map[] = new int[2001];
		int	num   = -1;

		for(int a = 0; a <= 1000; a++) {
			for(int b = 0; b <= 1000; b++) {
				map[a+b]++;
			}
		}

		while((num = parseNum()) != -1) {
			long	cnt = 0;
			for(int a = 0; a <= 1000; a++) {
				if (a > num) {
					break;
				}
				for(int b = 0; b <= 1000; b++) {
					if (a + b == num) {
						cnt += (long)map[a]*(long)map[b];
					} else if (a + b > num) {
						break;
					}
				}
			}
			System.out.println(cnt);
		}

	}

	private static int parseNum() {
		int		param = -1;
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