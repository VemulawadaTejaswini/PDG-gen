import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();

		int hour = time / (60 * 60);
		int min = (time - hour * 60 * 60) / 60;
		int sec = time - hour * 60 * 60 - min * 60;

		System.out.println(hour + ":" + min + ":" + sec);
	}

}
