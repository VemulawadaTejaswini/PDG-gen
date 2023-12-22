import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int second = scanner.nextInt();
		
		int hour = second / 3600;
		second -= hour * 3600;
		int minute = second / 60;
		second -= minute * 60;
		System.out.println(hour + ":" + minute + ":" + second);
	}	
}