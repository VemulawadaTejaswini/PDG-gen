import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] data = s.toCharArray();
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			int a = Character.getNumericValue(data[i]);
			sum += a;
		}
		int a = Integer.parseInt(s);
		if (a % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
