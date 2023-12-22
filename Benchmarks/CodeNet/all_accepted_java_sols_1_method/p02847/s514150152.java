import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] youbi = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

		String str= scan.next();

		for(int i = 0; i < 7; i++) {
			if(youbi[i].equals(str)) {
				System.out.println(7 - i);
			}
		}



	}
}
