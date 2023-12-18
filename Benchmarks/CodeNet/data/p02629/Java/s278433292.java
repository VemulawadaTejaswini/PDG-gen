import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			long n = sc.nextLong();
			
			char[] s = Long.toString(n, 26).toCharArray();
			
			int[] num = new int[s.length];
			char[] ret = new char[s.length];

			
			for(int i=0;i<s.length;i++) {
				num[i] = (int)s[i];
				if(num[i]==48) {
					num[i]++;
				}
				if(47<=num[i]&&num[i]<=58) {
					num[i] = num[i]+48;
					ret[i] = (char)(num[i]);
				}else {
					num[i] = num[i]+9;
					ret[i] = (char)(num[i]);
				}
			}
			
			for(int i=0;i<s.length;i++) {
				System.out.print(s[i]);
			}
			System.out.println("");
			for(int i=0;i<s.length;i++) {
				System.out.print(ret[i]);
			}

		}
	}
