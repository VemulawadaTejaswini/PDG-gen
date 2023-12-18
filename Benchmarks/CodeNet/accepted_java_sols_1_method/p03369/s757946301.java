import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int total = 700;
		for (char topping : S.toCharArray()) {
			if ("o".equals(String.valueOf(topping))) {
				total = total +  100;
			}
		}
		System.out.println(total);

	}
}
