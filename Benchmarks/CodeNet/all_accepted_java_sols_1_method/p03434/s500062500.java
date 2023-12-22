import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n];
		for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
		sc.close();
		int alice = 0, bob = 0, ans = 0;
		Arrays.sort(a);
		for(int i = n - 1; i >= 0; --i) {
			if(i % 2 == (n - 1) % 2) alice += a[i];
			else bob += a[i];
		}
		ans = alice - bob;
		System.out.println(ans);
	}

}
