import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Integer[] a = new Integer[5];

		for (int i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
		}

		scan.close();

		List<Integer> b = Arrays.asList(a);
		b.sort((x,y) -> -x.compareTo(y));
		System.out.println(b.get(0) + " " + b.get(1) + " " + b.get(2) + " " + b.get(3) + " " + b.get(4));
	}
}