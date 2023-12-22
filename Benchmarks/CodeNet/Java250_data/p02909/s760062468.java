import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);

		String nextWeather = c == 'S' ? "Cloudy"
							: c == 'C' ? "Rainy"
							: "Sunny";
		System.out.println(nextWeather);

		sc.close();
	}
}
