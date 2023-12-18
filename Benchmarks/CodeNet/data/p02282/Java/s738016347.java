
import java.util.*;

public class Main {
	public static int[] pre, in, post;
	public static int position, count;

	public static void reconstruct(int left, int right) {
		if (left >= right) return;
		int root = pre[position++];
		int middle = 0;
		while (in[middle] != root) middle++;
		reconstruct(left, middle);
		reconstruct(middle + 1, right);
		post[count++] = root;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		pre = new int[n];
		in = new int[n];
		post = new int[n];
		for (int i = 0; i < n; i++) pre[i] = scanner.nextInt();
		for (int i = 0; i < n; i++) in[i] = scanner.nextInt();
		position = 0;
		count = 0;
		reconstruct(0, n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(post[i]);
			sb.append(i != n - 1 ? " " : "\n");
		}
		System.out.print(sb);
	}
}