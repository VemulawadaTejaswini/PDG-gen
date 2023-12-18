
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for (int i=0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		int result = 0;

		boolean b = false;
		for (int i=0; i < N; i++) {
			b = false;
			for (int j=0; j < i; j++) {
				if (H[i] < H[j]) {
					b = true;
				}
			}
			if (!b) {
				result++;
			}
		}

		System.out.println(result);
	}
}
