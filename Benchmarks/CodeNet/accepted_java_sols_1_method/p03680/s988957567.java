import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			int b = a[0];
			int res = 1;
			
			for(int i=0;i<=n;i++) {
				if(b==2) {
					System.out.println(res);
					return;
				}
				
				b =a[b-1];
				res++;
			}
			
			System.out.println("-1");
			
		}

	}