
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(in.next());
		int[] m = new int[n];

		for (int i = 0; i < n; i++) {
			m[i] = Integer.parseInt(in.next());
		}

		int bottle = Integer.parseInt(in.next());
		int[] time = new int[bottle];
		for (int i = 0; i < bottle; i++) {
			int[] copyArray = new int[m.length];
			System.arraycopy(m, 0, copyArray, 0, m.length);

			int index = in.nextInt();
			int dorp = in.nextInt();
			copyArray[index - 1] = dorp;
			int sum = 0;
			for (int t : copyArray) {
				sum += t;
			}
			time[i] = sum;
		}
		in.close();
		for (int i : time) {
			out.println(i);
		}
		out.flush();

	}

}