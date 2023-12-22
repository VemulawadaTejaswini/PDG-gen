import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String result = "";
		if (input.substring(2,3).equals(input.substring(3,4)) && input.substring(4,5).equals(input.substring(5,6))) {
			result = "Yes";
		} else {
			result = "No";
		}
	    System.out.println(result);
	}
}
