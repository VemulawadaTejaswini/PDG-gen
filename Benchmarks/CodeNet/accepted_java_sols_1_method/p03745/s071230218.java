import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] a = new long[n];
			int zoge = 0;
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
			}
			
			int count =0 ;
			
			for(int i=0;i<n-1;i++) {
				if(a[i]<a[i+1]) {
					if(zoge ==-1) {
						count++;
						zoge =0;
						continue;
					}
					zoge = 1;
				}
				if(a[i]>a[i+1]) {
					if(zoge ==1) {
						count++;
						zoge =0;
						continue;
					}
					zoge = -1;
				}
			}
			
			System.out.println(count+1);
		}				
	}
