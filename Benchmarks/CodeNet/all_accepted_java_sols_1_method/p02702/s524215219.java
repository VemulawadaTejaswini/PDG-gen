import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String S = sc.next();
			int rem = 0;
			int ten = 1;
			int[] ret = new int[2019];
			int res = 0;
			
			for(int i=S.length()-1;i>=0;i--) {
				int num = S.charAt(i)-'0';
				rem += num*ten%2019;
				rem%=2019;
				ret[rem]++;
				
				ten = ten*10%2019;
			}
			
			res+=ret[0];
			
			for(int i=0;i<2019;i++) {
				res+=ret[i]*(ret[i]-1)/2;
			}
			
			System.out.println(res);
	    }
				
	}
