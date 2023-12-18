import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while (sc.hasNext()) {
			int d = sc.nextInt();
			int sum=0;
			for (int x = 0; x < 600; x += d) {
				sum+=x*x*d;
			}
			ln(sum);
		}
	}

	public static String join(double[] array, String separator) {
		StringBuilder str = new StringBuilder(array[0] + "");
		for (int i = 1; i < array.length; i++) {
			str.append(separator).append(array[i] + "");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}