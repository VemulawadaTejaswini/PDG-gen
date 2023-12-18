import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int sum = 0;
			String x = sc.next();
			if (x.equals("0"))
				break;
			for (int i = 0; i < x.length(); i++) {
				char ch = x.charAt(i);
				sum += Character.getNumericValue(ch);
			}
			System.out.println(sum);
		}
	}

}

