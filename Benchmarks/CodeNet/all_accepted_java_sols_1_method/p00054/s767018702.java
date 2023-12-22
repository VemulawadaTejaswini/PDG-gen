import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		String str = null;
	    String strSplit = null;
		String[] strs;
		int point = 0;
		int a = 0;
		int b = 0;
		int ans = 0;
		int n = 0;
		double f = 0;

		while(stdin.hasNext()) {
			a = stdin.nextInt();
			b = stdin.nextInt();
			n = stdin.nextInt();
			f = (double)a / (double)b;
 			str = String.valueOf(f);
			point = str.indexOf(".");
			strSplit = str.substring(point + 1);
			strs = strSplit.split("");
			for(int i = 0; i < n; i++) {
				if(i < strs.length) {
					ans += Integer.parseInt(strs[i]);
				}
				
			}
		
			System.out.println(ans);
			ans = 0;
		}
	}

}