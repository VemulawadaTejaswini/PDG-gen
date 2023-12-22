import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		int hour = time / 3600;
		time = time - hour * 3600;
		int min = time / 60;
		time = time - min * 60;
		int sec = time;
		
		System.out.println(hour + ":" + min + ":" + sec);
	}

}