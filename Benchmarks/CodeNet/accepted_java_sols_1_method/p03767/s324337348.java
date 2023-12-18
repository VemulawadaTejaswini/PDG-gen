import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int num = N*3;
		int a[] = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		long result = 0;
		Arrays.sort(a);
		for (int i = num-2; N > 0; i-=2) {
			result += a[i];
			N--;
		}
		out.println(result);
		out.flush();
	}
}