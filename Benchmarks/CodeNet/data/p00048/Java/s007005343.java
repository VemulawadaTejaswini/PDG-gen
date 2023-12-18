import java.util.Scanner;

class Main {

	public static final String LIGHT = "light";
	public static final String FLY = "fly";
	public static final String BANTAM = "bantam";
	public static final String FETHER = "feather";
	public static final String WELTER = "welter";
	public static final String MIDDLE = "middle";
	public static final String HEAVY = "heavy";

	public static void main(String[] args) {

		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			while (scanner.hasNextDouble()) {
				double weight = scanner.nextDouble();

				System.out.println(getClassName(weight));
			}

		} finally {
			scanner.close();
		}
	}

	public static String getClassName(double num) {
		StringBuilder sb = new StringBuilder();

		if (num <= 48.00 || (57.00 < num && num <= 64.00)
				|| (69.00 < num && num <= 75.00)
				|| (81.00 < num && num <= 91.00)) {
			sb.append(LIGHT);
			sb.append(" ");
		}
		if (num <= 51.00) {
			sb.append(FLY);
		} else if (num <= 54.00) {
			sb.append(BANTAM);
		} else if (num <= 57.00) {
			sb.append(FETHER);
		} else if (num <= 69.00) {
			sb.append(WELTER);
		} else if (num <= 81.00) {
			sb.append(MIDDLE);
		} else {
			sb.append(HEAVY);
		}

		return sb.toString().trim();

	}

}