import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int P = sc.nextInt();
		int costX = A * P;
		int costY;
		int cost;
		if (P <= C) {
			costY = B;
		} else {
			costY = B + D * (P - C);
		}
		if (costX > costY) {
			cost = costY;
		} else {
			cost = costX;
		}
		System.out.println(cost);
	}
}

