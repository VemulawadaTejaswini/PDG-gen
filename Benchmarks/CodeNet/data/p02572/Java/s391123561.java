import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		for(int i = 0;i < n; ++i)a[i] = scan.nextInt();

		long ans = 0;
		for(int i = 0;i < n; ++i){
			for(int j = i+1; j < n; ++j){
				ans += a[i]*a[j];
				ans %= 1000000000+7;
			}
		}
		System.out.print(ans);
	}
}
