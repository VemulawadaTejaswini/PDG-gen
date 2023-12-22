import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = new String[2];
		for (int i = 0; i < 2; i++) in[i] = sc.next();
		
		String[] weatherForecast = in[0].split("");
		String[] weather = in[1].split("");
		int count = 0;

		for (int i = 0; i < weatherForecast.length; i++) {
			if (weatherForecast[i].equals(weather[i]))
				count++;
		}
			
		System.out.println(count);
	}
}
