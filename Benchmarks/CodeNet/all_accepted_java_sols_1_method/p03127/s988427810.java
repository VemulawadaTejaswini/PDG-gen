import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			
			int min = a[0];
			int max = a[1];
			
			while(min>0) {
				int max2 = max - min;
				if(min<max2) {
					max = max2;
				}else {
					max = min;
					min = max2;
				}
			}
			int ret1 = max;
			
			int ret2 = Integer.MAX_VALUE;
			for(int i=1;i<n;i++) {
				if(a[i]-a[i-1]==0) {
					continue;
				}else {
					ret2 = Math.min(a[i]-a[i-1], ret2);
				}
			}
			
			System.out.println(Math.min(ret1,ret2));
		}
		
	}
