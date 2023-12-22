
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();

		int[] V = new int[N];

		for (int i=0; i < N; i++) {
			V[i] = sc.nextInt();
		}

		int result = 0;
		int tmp = 0;
		for (int i=0; i < N; i++) {
			tmp = V[i] - sc.nextInt();
			if (tmp > 0) {
				result += tmp;
			}
		}

		System.out.println(result);
	}
}
