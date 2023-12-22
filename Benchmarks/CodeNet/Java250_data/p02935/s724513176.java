import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] v = new int[N];
		for(int i = 0; i < N; i++) {
			v[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(v);
		double p = v[0];
		for(int i = 0; i < N; i++) {
			p = (p + v[i]) / 2;
		}
		System.out.println(p);
	}
}
