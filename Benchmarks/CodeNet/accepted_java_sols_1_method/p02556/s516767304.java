import java.util.*;
public class Main {

	public static void main(String[] args) {
		long INF = Long.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long xmax = -INF, xmin = INF, ymax = -INF, ymin = INF;
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			xmax = Math.max(xmax, x+y);
			xmin = Math.min(xmin, x+y);
			ymax = Math.max(ymax, x-y);
			ymin = Math.min(ymin, x-y);
		}
		System.out.println(Math.max(xmax - xmin, ymax - ymin));
	}

}
