import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int points[] = new int[w + 1];
		for (int i = 1; i <= w; ++i)
			points[i] = i;
		int n = sc.nextInt();
		sc.useDelimiter(",|\n");
		for (int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tmp = points[a];
			points[a] = points[b];
			points[b] = tmp;
		}
		for (int i = 1; i <= w; ++i)
			System.out.println(points[i]);
	}
}
