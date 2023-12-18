import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] n = new Integer[5];
		for (int i = 0; i < 5; i++) {
			n[i] = scanner.nextInt();
		}
		Arrays.sort(n, Collections.reverseOrder());
		System.out.printf("%d %d %d %d %d\n", n[0], n[1], n[2], n[3], n[4]);
	}
}