import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] P = new int[M];
		Long[] Y = new Long[M];
		for (int i = 0; i < M; i++) {
			P[i] = in.nextInt() - 1;
			Y[i] = in.nextLong();
		}
		ArrayList<ArrayList<Long>> vals = new ArrayList<ArrayList<Long>>() {
			{
				for (int i = 0; i < N; i++) {
					add(new ArrayList<Long>());
				}
			}
		};
		for (int i = 0; i < M; i++) {
			vals.get(P[i]).add(Y[i]);
		}
		for (int i = 0; i < N; i++) {
			Collections.sort(vals.get(i));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int v = P[i];
			int id = Collections.binarySearch(vals.get(v), Y[i]);
			sb.append(String.format("%06d%06d", v + 1, id + 1));
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb.toString());
		in.close();
	}
}