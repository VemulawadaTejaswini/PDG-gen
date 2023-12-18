import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] x = new int[m];
			int[] y = new int[m];
			int[] r = new int[n];
			int[] num = new int[n];
			r[0] = 1;
			
			for(int i=0;i<m;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				num[i] = 1;
			}
	       
			for(int i=0;i<m;i++) {
				num[x[i]-1]--;
				num[y[i]-1]++;
				if(r[x[i]-1]==1) {
					r[y[i]-1] = 1;
					
					if(num[x[i]-1]==0) {
						r[x[i]-1]=0;
					}
					
				}
				
			}
			
			int ret = 0;
			for(int i=0;i<n;i++) {
				ret += r[i];
			}
			
			System.out.println(ret);
		}
		
	}
