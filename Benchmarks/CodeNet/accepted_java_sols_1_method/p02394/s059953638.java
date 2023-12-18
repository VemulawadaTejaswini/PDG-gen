import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int r = stdIn.nextInt();
		stdIn.close();
		boolean isOk = false;

		//縦チェック
		if ((((y-r) >= 0)  && ((y+r) <= H)) && (((x-r) >= 0)  && ((x+r) <= W)))  isOk =true;

		if (isOk) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

