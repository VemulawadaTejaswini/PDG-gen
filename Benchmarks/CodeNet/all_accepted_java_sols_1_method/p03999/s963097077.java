import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			
			int N = S.length();
			
			String[]n = new String[N-1];
			
			long ans = 0;
			
			for(int i = 0;i<(int)Math.pow(2, N-1);i++) {
				Arrays.fill(n, "");
				for(int j = 0;j<N-1;j++) {
					if((1&i>>j)==1) {
						n[j] = "+";
					}
				}
				
				StringBuffer sb = new StringBuffer();
				char[]s = S.toCharArray();
				sb.append(s[0]);
				for(int j = 0;j<N-1;j++) {
					sb.append(n[j]);
					sb.append(s[j+1]);
				}
				//System.out.println(sb.toString());
				
				String H = sb.toString();
				long goukei = 0;
				int start = 0;
				
				for(int j = 0;j<H.length();j++) {
					String B = H;
					if(H.substring(j, j+1).equals("+")) {
						goukei+=Long.valueOf(B.substring(start, j));
						start = j+1;
					}else if(j==H.length()-1) {
						goukei+=Long.valueOf(B.substring(start, j+1));

					
				}
				}
				
				ans+=goukei;
				/*
				System.out.print(goukei);
				System.out.print(" ");
				
				System.out.println(H);
				
				*/
				
				
				
				
			}
			
			
			
			
			System.out.println(ans);
			
			
			
		}
		
		
	}
		

}
