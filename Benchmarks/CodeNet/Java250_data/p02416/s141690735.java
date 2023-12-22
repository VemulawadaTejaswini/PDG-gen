import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.nextLine();

			if("0".equals(input)){
				break;
			}
			
			long sum = 0;
			for (char c : input.toCharArray()) {
				sum += (c - '0');
			}
			System.out.println(sum);
		}
	}

}