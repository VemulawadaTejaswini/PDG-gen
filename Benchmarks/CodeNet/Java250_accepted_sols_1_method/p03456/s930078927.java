import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ", 0);
		double num = Double.parseDouble(line[0] + line[1]);
		double ans = Math.sqrt(num);

		//判定
		String ans_str = Double.toString(ans);
		if (ans_str.endsWith(".0")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
