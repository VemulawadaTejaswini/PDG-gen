import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> list = new ArrayList<Double>();

		while (sc.hasNext()) {
			list.add(sc.nextDouble());
		}

		Collections.sort(list);

		System.out.println((list.get(0) - list.get(list.size() - 1)) * -1);

	}

}