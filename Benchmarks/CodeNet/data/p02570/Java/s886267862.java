import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		int target = Integer.parseInt(array[0]);
		int speed = Integer.parseInt(array[1]);
		int time = Integer.parseInt(array[2]);
		int calc = target / speed;
		String result = calc <= time ? "Yes" : "No";
	    System.out.println(result);
	}
}
