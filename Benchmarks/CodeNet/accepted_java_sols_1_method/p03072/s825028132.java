import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] m = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
		}
		count++;
		for (int i = 1; i < n; i++) {
			boolean isSeen = true;
			for (int j = 0; j < i; j++) {
				if (m[i] < m[j])
					isSeen = false;
			}
			if (isSeen)
				count++;
		}
		System.out.println(count);
	}
}
