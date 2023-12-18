import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		penInfo();

	}

	public static void penInfo() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int cost;
		int costX = 0;
		int costY = 0;
		int numX = N / A;
		int numY = N / C;
		if (N % A != 0 ) {
			numX++;
		}
		costX = B * numX;
		if (N % C != 0 ) {
			numY++;
		}
		costY = D * numY;
		if (costX > costY) {
			cost = costY;
		} else {
			cost = costX;
		}
		System.out.println(cost);

	}
}

