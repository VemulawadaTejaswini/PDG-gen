import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\\D");
		int ax, by, i;
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] tate = new int[w];
		for (i = 0; i < w; i++) {
			tate[i] = i + 1;
		}
		for (i = 0; i < n; i++) {
			ax = sc.nextInt();
			by = sc.nextInt();
			int sub = tate[ax - 1];
			tate[ax - 1] = tate[by - 1];
			tate[by - 1] = sub;
		}
		for (i = 0; i < w; i++) {
			System.out.println(tate[i]);
		}
	}
}