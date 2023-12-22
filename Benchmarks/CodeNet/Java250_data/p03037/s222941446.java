import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int min = -1;
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			min = Math.max(min, in.nextInt());
			max = Math.min(max, in.nextInt());
		}
		System.out.println(max - min + 1 > 0 ? max - min + 1 : 0);
		in.close();
	}
}