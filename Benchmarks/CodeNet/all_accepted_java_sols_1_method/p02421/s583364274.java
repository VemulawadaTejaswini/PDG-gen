import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(input.readLine());
			
			int taro = 0;
			int hanako = 0;
			for (int i = 0; i < n; i++) {
				final String[] cards = input.readLine().split(" ");
				if (0 < cards[0].compareTo(cards[1])) {
					taro += 3;
				} else if (cards[0].compareTo(cards[1]) < 0) {
					hanako += 3;
				} else {
					taro++;
					hanako++;
				}
			}
			
			System.out.println(taro + " " + hanako);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}