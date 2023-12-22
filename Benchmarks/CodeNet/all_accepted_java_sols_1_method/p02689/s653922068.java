import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] h = new int[n+1];
			int[] a = new int[m+1];
			int[] b = new int[m+1];
			boolean[] ret = new boolean[n+1];
			
			for(int i=0;i<n+1;i++) {
				ret[i]=true;
			}
			
			for(int i=1;i<=n;i++) {
				h[i] = sc.nextInt();
			}
			
			for(int i=1;i<=m;i++) {
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			
			
			
			for(int j=1;j<=m;j++) {
				if(h[b[j]]>=h[a[j]]) {
					ret[a[j]]=false;
				}
				if(h[a[j]]>=h[b[j]]) {
					ret[b[j]]=false;
				}
			}
			
			int res = 0;
			
			for(int i=0;i<n+1;i++) {
				if(ret[i]) {
					res++;
				}
			}
			
			System.out.println(res-1);
			
			
			
		}
		
		
	}
