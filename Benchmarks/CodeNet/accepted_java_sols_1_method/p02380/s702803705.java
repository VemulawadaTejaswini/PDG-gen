import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sideA = sc.nextInt();
		int sideB = sc.nextInt();
		int angleC = sc.nextInt();

		// 角度をラジアンで指定
		double radianC = Math.toRadians(angleC);

		double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(radianC));
		double length = sideA + sideB + sideC;
		double area = 0.5 * sideA * sideB * Math.sin(radianC);
		double height = sideB * Math.sin(radianC);
		System.out.println(area);
		System.out.println(length);
		System.out.println(height);

		sc.close();

	}

}

