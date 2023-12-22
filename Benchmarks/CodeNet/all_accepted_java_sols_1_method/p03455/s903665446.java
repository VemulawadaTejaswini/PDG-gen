import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int multiply = a * b;
		String out;
		if (multiply % 2 == 0) {
			out = "Even";
		} else {
			out = "Odd";
		}
		System.out.println(out);
	}

}
