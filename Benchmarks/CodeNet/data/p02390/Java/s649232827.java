import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sec = s.nextInt();
		System.out.println((sec/3600) + ":" + ((sec%3600)/60) + ":" + (sec%60));
	}

}