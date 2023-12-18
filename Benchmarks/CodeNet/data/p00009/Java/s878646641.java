public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int input = 1;
		while (scan.hasNextInt()) {
			input = scan.nextInt();
			int total = 0;
			while (2 < input) {
				if (prime(input--))
					++total;
			}
			print(total);
		}
	}
	
	public static boolean prime(int value) {
		if (value % 2 == 0)
			return false;
		for (int i = 3; i < value; ++i) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}