import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		List<Double> list = new ArrayList<Double>();
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextDouble()) {
			 list.add(sc.nextDouble());
			}
			Double[] d = list.toArray(new Double[0]);
			Arrays.sort(d);
			System.out.println(d[d.length-1]-d[0]);

		} finally {
			sc.close();
		}

	}

}