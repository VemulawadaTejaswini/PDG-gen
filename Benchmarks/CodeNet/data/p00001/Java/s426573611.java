import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> height = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			height.add( sc.nextInt() );
		}

		top_three(height);
	}

	private static void top_three(ArrayList<Integer> height) {
		Collections.sort(height, Comparator.reverseOrder());

		for (int i = 0; i < 3; i++) {
			System.out.println( height.get(i) );
		}
	}
}
