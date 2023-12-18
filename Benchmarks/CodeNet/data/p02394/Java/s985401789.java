import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);


		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int r = stdIn.nextInt();

		if((H - y) < r || (W - x) < r)
			System.out.println("No");
                else if(x < 0 || y < 0)
			System.out.println("No");

		else
			System.out.println("Yes");

	}

}