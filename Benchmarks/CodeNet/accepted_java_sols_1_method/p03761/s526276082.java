import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			String[] S = new String[n];
			int[] ret = new int[26];
			Arrays.fill(ret, 51);
			
			for(int i=0;i<n;i++) {
				S[i] = sc.next();
			}
			
			for(int i=0;i<n;i++) {
				char[] s = S[i].toCharArray();
				int[] reti = new int[26];
				
				for(int j=0;j<s.length;j++) {
					reti[(int)s[j]-97]++;
				}
				
				for(int k=0;k<26;k++) {
					ret[k] = Math.min(ret[k], reti[k]);
				}
			}
			
			for(int i=0;i<26;i++) {
				for(int j=0;j<ret[i];j++) {
					System.out.print((char)(i+97));
				}
			}
	    }
				
	}
	
