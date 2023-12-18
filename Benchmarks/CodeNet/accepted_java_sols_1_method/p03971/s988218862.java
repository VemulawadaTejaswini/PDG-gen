import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			char[] s = sc.next().toCharArray();
			String[] ret = new String[n];
			
			int tuka = 0;
			int bt = 0;
			
			for(int i=0;i<n;i++) {
				if(s[i]=='a') {
					if(tuka<a+b) {
						ret[i] = "Yes";
						tuka++;
					}else {
						ret[i] = "No";
					}
				}else if(s[i]=='b') {
					bt++;
					if(tuka<a+b&&bt<=b) {
						ret[i] = "Yes";
						tuka++;
					}else {
						ret[i] = "No";
					}
				}else {
					ret[i] = "No";
				}
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(ret[i]);
			}
			
		}
	}
