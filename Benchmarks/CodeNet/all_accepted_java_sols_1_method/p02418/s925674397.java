import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String txt = sc.next();
		
		input = input + input;
		
		System.out.println(input.contains(txt) ? "Yes" : "No");
	}

}