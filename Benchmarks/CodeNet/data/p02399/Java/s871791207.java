import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("3 2");
		// Scanner scanner = new Scanner(System.in);
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < 2; i++) {
			list.add(scanner.nextDouble());
		}
		int d = (int) divide1(list.get(0), list.get(1));
		int r = (int) divide2(list.get(0), list.get(1));
		double f = divide3(list.get(0), list.get(1));
		System.out.println(d + " " + r + " " + f + "0000");
	}

	public static double divide1(double a, double b) {
		double ans = a / b;
		return ans;
	}

	public static double divide2(double a, double b) {
		double ans = a % b;
		return ans;
	}

	public static double divide3(double a, double b) {
		double ans1 = divide1(a, b);
		//double ans2 = divide2(a, b);
		return ans1;
	}
}