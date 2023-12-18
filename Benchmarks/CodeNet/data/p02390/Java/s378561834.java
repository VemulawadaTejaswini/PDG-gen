import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int h,m,s;

		Scanner stdIn = new Scanner(System.in);
		s = Integer.parseInt(stdIn.nextLine());

		h = s / 3600;
		s %= 3600;

		m = s / 60;
		s %= 60;

		System.out.println(h + ":" + m + ":" + s);

	}

}