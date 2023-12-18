import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[], count[];
		count = new int[2];
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			if (a[i] % 4 == 0)
				count[1]++;
			else if (a[i] % 2 == 0)
				count[0]++;
		}
		sc.close();

		int tmp = n - count[1];
		boolean ans = false;

		if (count[1] >= tmp - 1)
			ans = true;
		else {
			tmp = n - 2 * count[1];
			if(count[0] >= tmp)ans = true;
		}

		if (ans)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
