import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = 0;
			
			if(b==1) {
				System.out.println(0);
				return;
			}
			
			b -= a;
			if(b<=0) {
				System.out.println(1);
				return;
			}
			
			
			while(true) {
				if((b>0)) {
					ans++;
					b -= (a-1);
				}
				if(b<=0) {
					break;
				}
			}
			
			System.out.println(ans+1);
		}
	}
