import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int[] data = new int[3];
		if (X >= Y) {
			data[0] = (C * Y * 2) + (A * (X - Y));
			data[1] = C * X * 2;
		} else {
			data[0] = (C * X * 2) + (B * (Y - X));
			data[1] = C * Y * 2;
		}
		data[2] = A * X + B * Y;

		int min = data[0];
		for (int i = 1; i < 3; i++) {
			if (min > data[i])
				min = data[i];
		}
		System.out.println(min);

		sc.close();

	}

}