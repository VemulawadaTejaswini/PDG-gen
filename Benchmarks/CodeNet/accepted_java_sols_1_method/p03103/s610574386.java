import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		long[][] a =new long[n][2];
		long ans = 0;
		for(int i = 0;i<n;i++) {
			a[i][0]=scn.nextLong();
			a[i][1]=scn.nextLong();
		}
		Arrays.sort(a,(x,y)->Long.compare(x[0], y[0]));
		ans=0;
		for(int i = 0;0<m; i++) {
			if(m<=a[i][1]) {
				System.out.println(m*a[i][0]+ans);
				break;
			}else {
				m -= a[i][1];
				ans += a[i][0]*a[i][1];
			}
		}
		scn.close();
	}
}