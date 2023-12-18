import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Double> list = new ArrayList<Double>();

		for(int i =  0;i < n;i++) {
			list.add(scan.nextDouble());
		}

		Collections.sort(list);

		for(int i = 1;i < n;i++) {
			list.set(i, (list.get(i) + list.get(i - 1)) / 2);
		}

		System.out.println(list.get(n - 1));
	}
}