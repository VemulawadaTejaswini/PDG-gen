
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> vals = new ArrayList<>();
		for (int i = 0; i < 3; ++i) {
			vals.add(in.nextInt());
		}
		Collections.sort(vals);
		if (vals.get(0) == vals.get(2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}