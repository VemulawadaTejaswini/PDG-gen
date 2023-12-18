import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int continuousRain = 0; // 連続雨の日数
		int weatherYesterday = 0; // 昨日の天気

		String input = sc.next();

		for(int i = 0; i < 3; i++) {
			if(input.charAt(i) == 'R') {
				if(weatherYesterday == 1) {
					continuousRain ++;
				} else {
					continuousRain = 1;
				}
				weatherYesterday = 1;
			} else {
				weatherYesterday = 0;
			}
		}

		System.out.println(continuousRain);

		sc.close();

	}
}
