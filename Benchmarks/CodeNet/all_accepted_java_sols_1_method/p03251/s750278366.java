import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int xMax = x;
		int yMin = y;

		int[] aryX = new int[n];
		int[] aryY = new int[m];

		for (int i=0; i<n; i++){
			aryX[i] = sc.nextInt();
			xMax = Math.max(xMax, aryX[i]);
		}

		for (int i=0; i<m; i++){
			aryY[i] = sc.nextInt();
			yMin = Math.min(yMin, aryY[i]);
		}

		if (xMax < yMin){
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
	}
}