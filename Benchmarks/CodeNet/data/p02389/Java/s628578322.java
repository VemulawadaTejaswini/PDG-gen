import java.util.Scanner;

class Main {

	private static final String SPLIT_STR = " ";
	private static final String SPACE = " ";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x = sc.nextLine();

		String[] split = x.split(SPLIT_STR);

		int height = Integer.parseInt(split[0]);
		int width = Integer.parseInt(split[1]);

		sc.close();

		System.out.println(area(height, width) + SPACE + surfaceLength(height, width));
	}

	private static int area(int a, int b) {
		int result = a * b;
		return result;
	}

	private static int surfaceLength(int a, int b) {
		int result = a * 2 + b * 2;
		return result;
	}
}

