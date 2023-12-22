import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> inputs = new ArrayList<>();

		while(true) {

			String input = sc.nextLine();
			if(input.equals("0")) break;

			inputs.add(input);

		}
		sc.close();

		for(String input : inputs) {

			int i = 0;

			if(input.charAt(0) == '-') i = 1;

			int ans = 0;
			for (; i < input.length(); i++) {
				ans += Character.getNumericValue(input.charAt(i));
			}

			System.out.println(ans);
		}
	}
}