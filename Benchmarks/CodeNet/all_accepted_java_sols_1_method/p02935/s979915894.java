import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> vArray = new ArrayList<Integer>();
		int idx;
		for (idx = 0; idx < N; idx++) {
			vArray.add(Integer.parseInt(sc.next()));
		}
		//sort
		Collections.sort(vArray);

		double value = vArray.get(0).doubleValue();
		for (idx = 1; idx < vArray.size(); idx++) {
			value = (value + vArray.get(idx).doubleValue()) / 2.0d;
		}

		System.out.println(value);

	}

}
