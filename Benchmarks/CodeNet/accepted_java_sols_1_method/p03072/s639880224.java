import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		ArrayList<String> ary = new ArrayList<String>();
		int max = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(sc.next());
			if (n >= max) {
				max = n;
				count++;
			}
		}
		System.out.println(count);
	}

}