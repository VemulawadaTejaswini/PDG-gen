import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] ai = new int[a];
		int b = sc.nextInt();
		int[] bi = new int[b];
		int m = sc.nextInt();
		int min = 2000000000;
		int minA = 2000000000;
		int minB = 2000000000;

		for(int i = 0; i < a; i++) {
			ai[i] = sc.nextInt();
			minA = (minA > ai[i]) ? ai[i] : minA;
		}

		for(int i = 0; i < b; i++) {
			bi[i] = sc.nextInt();
			minB = (minB > bi[i]) ? bi[i] : minB;
		}

		min = minA + minB;

		int n;
		for(int i = 0; i < m; i++) {
			n = ai[sc.nextInt() - 1] + bi[sc.nextInt() - 1] - sc.nextInt();
			min = (min > n) ? n : min;
		}

		System.out.println(min);
		sc.close();
	}
}
