
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Integer[] mountainHigh = new Integer[10];
		Scanner stdin = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			mountainHigh[i] = stdin.nextInt();
		}
		Arrays.sort(mountainHigh,Comparator.reverseOrder());

		for(int high = 0; high < 3; high++) {
			System.out.println(mountainHigh[high]);
		}

	}

}