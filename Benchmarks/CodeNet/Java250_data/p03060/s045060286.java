import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		int result = calc(v, c, 0, 0);
		System.out.println(result);
	}
	
	public static int calc(int[] v, int[] c, int money, int i) {
		if (i >= v.length) {
			return money;
		} else {
			if (v[i] - c[i] > 0) {
				money += v[i] - c[i];
			}
			return calc(v, c, money, ++i);
		}
	}
}
