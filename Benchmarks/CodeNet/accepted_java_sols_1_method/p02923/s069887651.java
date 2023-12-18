

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		int max = 0;

		int cnt = 0;
		H[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {
			H[i] = sc.nextInt();
			if (H[i - 1] < H[i]) {
				max = Math.max(max, cnt);
				cnt = 0;
			} else {
				cnt++;
			}
		}
		max = Math.max(max, cnt);
		System.out.println(max);
	}
}