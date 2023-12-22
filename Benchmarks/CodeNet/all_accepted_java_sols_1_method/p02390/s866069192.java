import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner (System.in);

		int num = stdIn.nextInt();
		int h = num / 3600;
		num %= 3600;
		int m = num / 60;
		num %= 60;
		System.out.println(h + ":" + m + ":" + num);

	}

}