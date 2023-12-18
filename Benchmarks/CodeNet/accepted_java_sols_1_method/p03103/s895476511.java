import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		Long[][] a = new Long[n][2];
		for(int i=0;i<n;i++) {
			a[i][0]=sc.nextLong();
			a[i][1]=sc.nextLong();
		}
		
		Arrays.sort(a,(x,y)->Long.compare(x[0], y[0]));
		long l=0;
		for(int i=0;i<n;i++) {
			long k=a[i][1];
			m-=k;
			if(m>0) {
				l+=k*a[i][0];
			}else {
				l+=a[i][0]*(m+k);
				System.out.println(l);
				break;
			}
		}
    }

}
