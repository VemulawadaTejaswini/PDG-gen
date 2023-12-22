import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			long tp = sc.nextLong();
			a[i] =  tp;
		}
		for(int i = 0; i < n; i++) {
			for(;;) {
				if(a[i] % 2 == 1 || a[i] / 2 < 1) {
					break;
				}
				ans += 1;
				a[i] = a[i]/2; 
			}
		}
		System.out.println(ans);
     }
}