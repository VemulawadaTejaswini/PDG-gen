import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
		String[] array = input.split(" ");
		List<String> list = Arrays.asList(array);
	    System.out.println(list.indexOf("0") + 1);
	}
}
