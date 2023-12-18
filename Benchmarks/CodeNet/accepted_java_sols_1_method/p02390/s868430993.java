import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int seconds = sc.nextInt();
		int hour_sec = 60 * 60;
		int minute_sec = 60;
		int h = seconds / hour_sec;
		int m = (seconds % hour_sec) / minute_sec;
		int s = seconds % hour_sec % minute_sec;
		System.out.println(String.valueOf(h) + ":" + String.valueOf(m) + ":" + String.valueOf(s));
		sc.close();
	}
}