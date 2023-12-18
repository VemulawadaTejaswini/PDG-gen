import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		int s;
		Scanner scan = new Scanner(System.in);
		s = scan.nextInt();
		int hour = (s / 60) / 60;
		int min =  (s / 60) % 60;
        int sec = (s % 60);

		System.out.println(hour + ":" + min + ":" + sec);
	}

}