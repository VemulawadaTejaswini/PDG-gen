import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
		String ichi = input.substring(input.length() - 1);
		String result = "";
		switch (ichi) {
			case "3":
				result = "bon";
				break;
			case "0":
			case "1":
			case "6":
			case "8":
				result = "pon";
				break;
			default:
				result = "hon";
		}
	    System.out.println(result);
	}
}
