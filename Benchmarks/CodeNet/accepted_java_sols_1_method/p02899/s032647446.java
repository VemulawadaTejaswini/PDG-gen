import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int[] j = new int[num];
			for (int i = 0; i < num; i++) {
				int cur = sc.nextInt() - 1;
				j[cur] = i + 1;
			}
			for (int i = 0; i < num; i++) {
				System.out.print(j[i] + " ");
			}
		}
	}
}
