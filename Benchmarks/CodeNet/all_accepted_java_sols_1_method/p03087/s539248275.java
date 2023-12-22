import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int q = sc.nextInt();
			char[] S = sc.next().toCharArray();
			char[] s = new char[n+1];
			int[] l = new int[q];
			int[] r = new int[q];
			int[] num = new int[n+1];
			int sum = 0;
			
			for(int i=1;i<=n;i++) {
				s[i] = S[i-1];
				if(i>1&&s[i]=='C'&&s[i-1]=='A') {
					sum++;
				}
				
				num[i] = sum;
			}
			
			
			for(int i=0;i<q;i++) {
				l[i] = sc.nextInt();
				r[i] = sc.nextInt();
			}
			
			for(int i=0;i<q;i++) {
				System.out.println(num[r[i]]-num[l[i]]);
			}
			
			
	    }
		
	}
	
