import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char n[] = N.toCharArray();
		int S = 0;
		for (char num : n) {
			S += Character.getNumericValue(num);
		}
		if (Integer.parseInt(N) % S == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
