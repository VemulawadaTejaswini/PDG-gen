import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double L = sc.nextDouble();
		double areaLength = L / 3;

		String printStr = String.format("%.12f", areaLength * areaLength * areaLength);
		System.out.println(printStr);
	}
}
