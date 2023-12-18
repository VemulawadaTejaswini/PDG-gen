
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)break;
			
			int[] p = new int[n];
			for(int i=0;i<n;i++) {
				p[i] = sc.nextInt();
			}
			
			int[] q = new int[((n+2)*(n+1))/2];
			int r = 0;
			for(int i = 0;i<=n;i++) {
				for(int j=i;j<=n;j++) {
					q[r] = p[i]+p[j];
					r++;
				}
			}
			Arrays.sort(q);
			
			int s = 0;
			r--;
			for(int i=0;i<r;i++) {
				while(r>=0 && q[i]+q[r] > m)r--;
				if(r >= 0)s = Math.max(s,q[i]+q[r]);
			}
			System.out.println(s);
			
		}
	}
}

