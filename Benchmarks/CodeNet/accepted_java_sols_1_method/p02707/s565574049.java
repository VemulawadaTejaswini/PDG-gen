import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n-1];
			int[] ret = new int[n];
			
			for(int i=0;i<n-1;i++) {
				a[i] = sc.nextInt();
			}
			
			
			for(int i=0;i<n-1;i++) {
				ret[a[i]-1]++;
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(ret[i]);
			}
		}
	}
