import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Integer.parseInt(sc.next());
		long ret = 0;
		int i = 2;
		while (true) {
			int step = i / 2;
			long start = (i + 1) / 2 * step;
			if (start > N)
				break;
			long end = N / step * step;
			ret += (start + end) * ((end - start) / step + 1) / 2;
			i += 1;
		}
		System.out.println(ret);
	}
}