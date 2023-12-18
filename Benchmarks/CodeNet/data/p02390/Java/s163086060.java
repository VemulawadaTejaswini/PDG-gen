import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input_sec = sc.nextInt();
		int hour = input_sec / 3600;
		int min = ( input_sec % 3600 ) / 60;
		int sec = ( input_sec % 3600 ) % 60;

		System.out.println( hour + ":" + min + ":" + sec );
	}

}
