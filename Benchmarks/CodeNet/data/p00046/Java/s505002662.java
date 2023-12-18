import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		List<Double> list = new ArrayList<Double>();

		for(int i = 0; i < 5; i++){
		list.add(sc.nextDouble());
		}

		Collections.sort(list);

		System.out.println(list.get(list.size() - 1) - list.get(0));
	}

}