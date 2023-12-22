import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		List<Double> v = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			v.add(sc.nextDouble());
		}
		v.sort(null);
		while (v.size() > 1) {
			double vv = (v.remove(0) + v.remove(0)) / 2;
			v.add(0, vv);
		}
		System.out.println(v.get(0));
	}
}