import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countDeta;
		int[] detaX = new int[3000];
		int[] detaY = new int[3000];
		for (countDeta = 0; true; countDeta++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			detaX[countDeta] = x;
			detaY[countDeta] = y;
		}
		for (int i = 0; i < countDeta; i++) {
			if (detaX[i] <= detaY[i]) {
				System.out.println(detaX[i] + " " + detaY[i]);
			} else {
				System.out.println(detaY[i] + " " + detaX[i]);
			}
		}
		sc.close();
	}
}
