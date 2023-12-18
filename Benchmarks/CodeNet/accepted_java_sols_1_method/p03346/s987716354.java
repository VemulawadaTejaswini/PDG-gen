import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] p = new int[n + 1];
		for (int i = 1; i <= n; i++)
			p[Integer.parseInt(sc.next())] = i;
		int max = 1;
		int tem = 1;
		for (int i = 2; i <= n; i++) {
			if (p[i] < p[i - 1])
				tem = 1;
			else
				tem++;
			max = Math.max(max, tem);
		}
		System.out.println(n - max);
	}
}