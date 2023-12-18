import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int box[] = new int[N];
		for (int i = 0; i < N; i++) {
			box[i] = Integer.parseInt(sc.next());
		}

		double ans = java.util.Arrays.stream(box).mapToDouble(s -> 1.0 / s).sum();

		ans = 1.0 / ans;
		
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}

}

