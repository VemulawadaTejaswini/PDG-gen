import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), l = sc.nextInt();
		sc.close();
		int sum = n * (l - 1) + ((n + 1) * n / 2);
		if (l >= 0)
			sum -= l;
		else {
			if (Math.abs(l) >= n)
				sum -= (l + n - 1);
		}

		System.out.println(sum);
	}
}
