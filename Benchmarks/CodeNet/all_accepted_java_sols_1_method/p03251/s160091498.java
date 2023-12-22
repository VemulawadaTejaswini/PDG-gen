import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numX = sc.nextInt();
		int numY = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		Integer xs[] = new Integer[numX];
		int ys[] = new int[numY];
		for(int i = 0; i < numX;i ++) {
			xs[i] = sc.nextInt();
		}
		for(int i = 0; i < numY;i ++) {
			ys[i] = sc.nextInt();
		}
		Arrays.sort(xs, Collections.reverseOrder());
		Arrays.sort(ys);
		boolean noConflicts = xs[0] < ys[0];
		if(noConflicts) {
			noConflicts = false;
			for(int z = xs[0] + 1; z <= ys[0]; z ++) {
				if(z > x && z <= y) {
					noConflicts = true;
					break;
				}
			}
		}
		System.out.println(noConflicts ? "No War" : "War");
	}
}