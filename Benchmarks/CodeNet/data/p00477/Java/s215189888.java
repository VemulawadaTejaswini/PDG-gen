import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int minute, second;;
		
		minute = 0;
		second = 0;
		for (int i = 0; i < 4; i++) {
			second += sc.nextInt();
		}
		
		minute = second / 60;
		second %= 60;
		
		System.out.println(minute);
		System.out.println(second);
	}
}