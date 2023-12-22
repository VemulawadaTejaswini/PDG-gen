import java.util.Scanner;
	public class Main {
	
		public static void main(String[] args) {
			solve();
		}
		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int array[] = new int[n];
			String res = "APPROVED";
			for(int i = 0;i<n;i++) {
				array[i] =sc.nextInt();
				if(array[i]%2==0&&!(array[i]%3==0||array[i]%5==0)) {
						res = "DENIED";
					}
				
			}
			System.out.println(res);
			sc.close();
		}	
	}
	
