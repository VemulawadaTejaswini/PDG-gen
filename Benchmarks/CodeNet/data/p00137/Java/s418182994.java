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
		int cnt = parseNum();

		for (int i = 0; i < cnt; i++) {
			int	num = parseNum();
			System.out.println("Case "+(i+1)+":");
			for (int k = 0; k < 10; k++) {
				num = (num > 10) ? ((num*num)/100)%10000 : 0;
				System.out.println(num);
			}
		}
	}
 
	private static int parseNum() {
		int     num = 0;
		String  str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}
 
	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) stdin = tmp;
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}