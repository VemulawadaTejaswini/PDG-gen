import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(tenki(scanner.nextLine(), scanner.nextLine()));
		scanner.close();
	}
	
	public static int tenki(String forecast, String weather) {
		int result = 0;
		for(int i = 0; i < 3; i++) {
			if(forecast.charAt(i) == weather.charAt(i)) {
				result++;
			}
		}
		return result;
	}
}