import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			
			long[] s = new long[N+1+1];
			int Q = scan.nextInt();
			String S = scan.next();
			char []c = new char[N];
			c = S.toCharArray();
			int []l = new int[Q];
			int []r = new int[Q];
			for(int i = 0;i<Q;i++) {
				l[i] = scan.nextInt();
				r[i] = scan.nextInt();
			}
			
			for(int i = 0;i<N;i++) {
				if(i>=1) {
				if(c[i]=='C'&&c[i-1]=='A') {
					s[i+1] = s[i]+1;
				}else {
					s[i+1] = s[i];
				}
				
			}
				//System.out.println(s[i+1]);
			}
				
			for(int i = 0;i<Q;i++) {	
				long a = s[r[i]]-s[l[i]];
				System.out.println(a);
			}
			
			
			
			
		}
		
		
	}
		

}
