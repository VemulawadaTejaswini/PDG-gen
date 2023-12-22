import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		ArrayList<Double> v = new ArrayList<>();
		for(i = 0; i < n; i++) {
			v.add(scan.nextDouble());
		}

		while(v.size() > 1) {
			Collections.sort(v);
			v.add((v.get(0) + v.get(1)) / 2);
			v.remove(0);
			v.remove(0);
		}
		System.out.println(v.get(0));
	}
}