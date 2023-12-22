import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] p =new int[m];
			String[] s = new String[m];
			int[] ac = new int[n+1];
			int[] wa = new int[n+1];
			
			for(int i=0;i<m;i++) {
				p[i] = sc.nextInt();
				s[i] = sc.next();
			}
			
			for(int i=0;i<m;i++) {
				if(s[i].equals("AC")&&!(ac[p[i]]>=1)) {
					ac[p[i]] = 1;
				}
				if(s[i].equals("WA")&&!(ac[p[i]]>=1)) {
					wa[p[i]]++;
				}
			}
			
			int acnum = 0;
			int penanum = 0;
			
			for(int i=1;i<=n;i++) {
				acnum += ac[i];
				if(ac[i]>0) {
					penanum += wa[i];
				}
			}
			
			System.out.println(acnum+" "+penanum);
		}
		
	}
