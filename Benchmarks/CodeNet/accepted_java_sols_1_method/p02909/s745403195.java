import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 今日の天気の入力
		String weather = sc.next();
		
		// 明日の天気を予測
		switch(weather) {
		case "Sunny":
			System.out.println("Cloudy");
			break;
		case "Cloudy":
			System.out.println("Rainy");
			break;
		case "Rainy":
			System.out.println("Sunny");
			break;
		}
	}
}
