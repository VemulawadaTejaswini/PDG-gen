
public class Main {

	public static void main(String[] args) {
		int x = 147;
		int y = 105;

		int max = 1;

		for (int i = 2; i < y; i++) {
			if (x % i == 0 && y % i == 0) {
				max = i;
			}
		}

		System.out.println(max);
	}

}

