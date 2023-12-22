import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		int n;
		TreeSet<String> ts = new TreeSet<>();
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		String[] array = new String[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.next();
		}

		for(int i = 0; i < array.length; i++) {
			ts.add(array[i]);
		}

		System.out.println(ts.size());
	}
}
