import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int debt = 100000;
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			debt = (int)(debt * 1.05);
		}
		debt = debt - (debt % 10000) + 10000;
		System.out.println(debt);
	}
}