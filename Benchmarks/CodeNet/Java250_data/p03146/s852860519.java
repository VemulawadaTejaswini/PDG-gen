import java.util.*;

public class Main {
	final static int MMAX = 1000000;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.next());
		sc.close();
		int ans = 0;
		long[] a = new long[MMAX+1];
		a[1] = s;
		HashMap<Long, Integer> amap = new HashMap<>();
		amap.put(a[1], 1);
		for(i=2;i<=MMAX;i++) {
			if(a[i-1]%2==0) {
				a[i] = a[i-1]/2;
			} else {
				a[i] = 3*a[i-1]+1; 
			}
			Integer ii = amap.get(a[i]);
			if(ii == null) {
				amap.put(a[i], i);
			} else {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
