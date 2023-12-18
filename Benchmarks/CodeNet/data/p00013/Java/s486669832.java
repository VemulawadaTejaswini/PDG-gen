import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> rail = new ArrayList<Integer>();
	public static void main(String[] args) {

		while (sc.hasNext()) {
			train_rail( sc.nextInt() );
		}

	}

	private static void train_rail(int nextInt) {

		if (nextInt == 0) {
			System.out.println( rail.get(rail.size() -1) );
			rail.remove(rail.size() -1);
		} else {
			rail.add(nextInt);
		}

	}

}
