import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a_1 = scanner.nextInt();
		int b_1 = scanner.nextInt();
		int a_2 = scanner.nextInt();
		int b_2 = scanner.nextInt();

		int x = (a_1 - a_2) *  (a_1 - a_2) + (b_1 - b_2) *  (b_1 - b_2);

		System.out.println(String.format("%.5f",Math.sqrt(x)));
	}
}