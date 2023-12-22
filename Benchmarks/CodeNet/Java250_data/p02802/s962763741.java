
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ac=0;
		int wa=0;
		int[][] p = new int[n][2];
		
		for(int i=0;i<m;i++) {
		
			int k = sc.nextInt()-1;
			String t = sc.next();
			
			
			if(p[k][0]==0&&t.equals("AC")) {
				p[k][0]++;
			}
			if(p[k][0]==0&&t.equals("WA")) {
				p[k][1]++;
			}	
			
		}
		
		for(int i=0;i<n;i++) {
			if(p[i][0]==1) {
				ac++;
				wa+=p[i][1];
			}
		}
		
		System.out.println(ac+" "+wa);
		
		sc.close();
	}
}
