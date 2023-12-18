import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String firstNum = n.substring(0, 1);

		if (Integer.parseInt(n) > Integer.parseInt(firstNum + firstNum + firstNum)) {
			int a = Integer.parseInt(firstNum) + 1;
			System.out.println(String.valueOf(a) + String.valueOf(a) + String.valueOf(a));
		} else if (Integer.parseInt(n) <= Integer.parseInt(firstNum + firstNum + firstNum)) {
			System.out.println(firstNum + firstNum + firstNum);
		}
	}
}