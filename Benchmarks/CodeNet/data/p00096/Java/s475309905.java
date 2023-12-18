import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


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
		int[][]			np  = new int[5][4001];
		int				num = -1;
		int				max = -1;
		Stack<Integer>	stk = new Stack<Integer>();

		np[0][0] = 1;

		while((num = parseNum()) != -1) {
			max = Math.max(max, num);
			stk.push(num);
		}

		if (stk.size() > 0) {
			for(int i = 1;i <= 4;i++){
				for(int j = 0;j <= max;j++){
					for(int k = 0;k <= 1000 && j-k >= 0;k++){
						np[i][j] += np[i-1][j-k];
					}
				}
			}

			for (int i = 0; i < stk.size(); i++) {
	            System.out.println(np[4][stk.get(i)]);
			}
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