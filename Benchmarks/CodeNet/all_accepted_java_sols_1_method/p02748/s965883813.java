import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		int[] xArr = new int[x];
		int[] yArr = new int[y];
		int minX = Integer.MAX_VALUE;
		for (int i = 0; i < x; i++) {
			xArr[i] = sc.nextInt();
			minX = Math.min(xArr[i], minX);
		}
		int minY = Integer.MAX_VALUE;
		for (int i = 0; i < y; i++) {
			yArr[i] = sc.nextInt();
			minY = Math.min(yArr[i], minY);
		}
		int min = minX + minY;
		for (int i = 0; i < n; i++) {
			int iX = sc.nextInt();
			int iY = sc.nextInt();
			min = Math.min(min, xArr[iX-1] + yArr[iY-1] - sc.nextInt());
		}
		System.out.println(min);
	}
}
