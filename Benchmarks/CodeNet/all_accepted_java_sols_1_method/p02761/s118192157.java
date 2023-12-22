import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] s = new int[m];
			int[] c = new int[m];
			int[] num = new int[n+1];
			
			for(int i=0;i<m;i++) {
				s[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			
			for(int i=0;i<n+1;i++) {
				num[i] = -1;
			}
			
			for(int i=0;i<m;i++) {
				if(n!=1&&s[i]==1&&c[i]==0) {
					System.out.println(-1);
					return;
				}
				if(num[s[i]]==-1){
					num[s[i]] = c[i];
					continue;
				}
				if(num[s[i]]!=c[i]){
					System.out.println(-1);
					return;
				}
				
			}
			
			if(n==1) {
				if(num[1]==-1) {
					System.out.println(0);
					return;
				}
			}else if(num[1]==-1) {
				num[1] = 1;
			}
			
			
			for(int i=2;i<n+1;i++) {
				if(num[i]==-1) {
					num[i]=0;
				}
			}
			
			for(int i=1;i<n+1;i++) {
				System.out.print(num[i]);
			}
			
	    }
				
	}
