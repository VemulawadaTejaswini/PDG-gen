import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			String S = sc.next();
			String T = sc.next();
			char[] t = T.toCharArray();
			int n = t.length;
			String S2 = S+t[n-1];
			
			if(T.equals(S2)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}
		
	}
