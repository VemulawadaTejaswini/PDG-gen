import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		int N;
		TreeSet<Integer> mochi = new TreeSet<Integer>(Collections.reverseOrder());
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for(int i = 0; i < N; i++) {
			mochi.add(scan.nextInt());
		}
		System.out.println(mochi.size());
		scan.close();
	}
}
