import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		input.close();
		
		int hour = s / 3600;
		int minute = (s / 60) % 60;
		int second = s % 60;
		
		System.out.println(hour + ":" + minute + ":" + second);
	}
}