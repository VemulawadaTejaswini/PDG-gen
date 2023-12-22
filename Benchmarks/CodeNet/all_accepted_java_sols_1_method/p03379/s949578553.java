import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			
			for(int i=0;i<n;i++) {
				x[i]=sc.nextInt();
				y[i] = x[i];
			}
			
			Arrays.sort(y);
			
			int a = y[n/2-1];
			int b = y[n/2];
			
			
			for(int i=0;i<n;i++) {
				if(x[i]<=a) {
					System.out.println(b);
				}else {
					System.out.println(a);
				}
			}
			
		}
		
	}
