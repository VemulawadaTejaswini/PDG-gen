import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = {Integer.parseInt(scan.next()), Integer.parseInt(scan.next()), Integer.parseInt(scan.next())};
		Arrays.sort(array);
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
		scan.close();
	}
}
