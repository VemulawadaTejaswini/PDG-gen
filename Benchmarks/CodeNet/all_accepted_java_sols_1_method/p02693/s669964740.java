import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int input = Integer.parseInt(sc.nextLine());
		String[] array = sc.nextLine().split(" ");
		int min = Integer.parseInt(array[0]);
		int max = Integer.parseInt(array[1]);
		String result = max/input*input >= min ? "OK" : "NG";
	    System.out.println(result);
	}
}
