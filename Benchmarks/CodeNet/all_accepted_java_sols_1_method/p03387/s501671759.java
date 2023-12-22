import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int ans = 0;
		ans += a[2] - a[1];
		a[0] += ans;
		if((a[2] - a[0]) % 2 == 0)
			ans += (a[2]-a[0])/2;
		else
			ans += (a[2]-a[0] + 1)/2 + 1;
		System.out.println(ans);

	}

}