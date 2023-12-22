import java.util.*;

public class Main {
	
	public static long solve(int k) {
		if(k % 2 != 0)return 0;
		long ans = 0;
		ans = 1 + solve(k / 2);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		long ans = 0;
		for(int i = 0; i < n; ++i)
			ans += solve(a[i]);
		
		System.out.println(ans);
	}

}
