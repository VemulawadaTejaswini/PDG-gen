import java.util.Arrays;
import java.util.Scanner;

class Main {
	static int x;
	static int minI;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] l = new int[n * 2];

		for (int i = 0; i < l.length; i++) {
			l[i] = sc.nextInt();
		}

		Arrays.sort(l);

		int sum = 0;
		for (int i = 0; i < l.length; i += 2) {
			sum += l[i];
		}

		System.out.println(sum);

		sc.close();
	}

}
