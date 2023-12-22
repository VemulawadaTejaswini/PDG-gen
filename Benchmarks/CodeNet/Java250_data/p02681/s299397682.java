import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input1 = sc.nextLine();
	    String input2 = sc.nextLine();
		String before = input2.substring(0, input2.length()-1);
		String result = input1.equals(before) ? "Yes" : "No";
	    System.out.println(result);
	}
}
