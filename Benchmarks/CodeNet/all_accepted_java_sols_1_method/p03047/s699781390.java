
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int result = 0;
		for (int i=0; i <= N ;i++) {
			if (i+K <= N) {
				result++;
			}
		}

		System.out.println(result);
	}
}