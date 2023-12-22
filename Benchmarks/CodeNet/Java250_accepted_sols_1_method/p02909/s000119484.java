import java.util.Scanner;

public class Main {

	public static final String SUUNY = "Sunny";
	public static final String CLOUDY = "Cloudy";
	public static final String RAINY = "Rainy";

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		String str = scan.next();

		//出力値
		String result = null;

		if (str.equals(SUUNY)) {
			result = CLOUDY;
		} else if (str.equals(CLOUDY)) {
			result = RAINY;
		}  else if (str.equals(RAINY)) {
			result = SUUNY;
		}

		System.out.println(result);
	}
}