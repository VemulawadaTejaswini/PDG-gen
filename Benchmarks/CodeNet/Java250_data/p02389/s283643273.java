import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int str1 = scan.nextInt();
		int str2 = scan.nextInt();
		System.out.println(str1 * str2 + " " + (str1 * 2 + str2 * 2));
	}
}