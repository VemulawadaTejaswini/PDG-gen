import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt();
		int[] m = new int[n];
		for (int i = 0; i < m.length; i++)
			m[i] = sc.nextInt();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < m.length; i++) {
			x -= m[i];
			min = Math.min(m[i], min);
		}

		System.out.println(x / min + n);
	}

}