import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
		String result = input.equals("ABC") ? "ARC" : "ABC";
	    System.out.println(result);
	}
}
