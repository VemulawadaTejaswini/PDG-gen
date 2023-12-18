import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		while ((num = in.nextInt()) != 0) {
			String newNum = Integer.toOctalString(num);
			newNum = newNum.replace('7', '9');
			newNum = newNum.replace('6', '8');
			newNum = newNum.replace('5', '7');
			newNum = newNum.replace('4', '5');
			System.out.println(newNum);
		}
	}
}