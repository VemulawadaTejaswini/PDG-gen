import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int tmp[] = new int[n];
		for (int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
			tmp[i] = x[i];
		}
		sc.close();
		Arrays.sort(tmp);
		int s = n / 2;
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			if (tmp[s - 1] < x[i])
				ans = tmp[s - 1];
			else
				ans = tmp[s];
			System.out.println(ans);
		}
	}

}
