import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			String S = sc.next();
			char[] s = S.toCharArray();
			
			long r = 0;
			long g = 0;
			long b = 0;
			
			for(int i=0;i<n;i++) {
				if(s[i]=='R') {
					r++;
				}else if(s[i]=='G') {
					g++;
				}else {
					b++;
				}
			}
			
			long res = r*g*b;
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					int k = j+(j-i);
					
					if(k<n&&s[i]!=s[j]&&s[j]!=s[k]&&s[i]!=s[k]) {
						res--;
					}
				}
			}
			
			if(res<=0) {
				System.out.println("0");
			}else {
				System.out.println(res);
			}
			
		}	
	}
