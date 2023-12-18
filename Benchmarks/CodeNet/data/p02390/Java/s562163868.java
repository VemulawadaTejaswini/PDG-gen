import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		
		int sec = kbScanner.nextInt();
		
		int hour = 0, minute = 0, second = 0;
		
		hour = sec / 3600;
		sec -= hour;
		minute = sec / 60;
		sec -= minute;
		second = sec;
		
		System.out.println(hour + ":" + minute + ":" + second);
	}
}