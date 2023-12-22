import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		double[] x = new double[N];
		String[] u = new String[N];
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.nextLine().split(" ");
			x[i] = Double.parseDouble(tokens[0]);
			u[i] = tokens[1];
		}
		in.close();
		double result = 0.0;
		for (int i = 0; i < N; ++i) {
			if (u[i].equals("JPY")) {
				result += x[i];
			} else {
				result += x[i] * (380000.0);
			}
		}
		System.out.println(result);
	}

}