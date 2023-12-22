import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[101];
		for (int i = 0; i < d.length; i++) {
			d[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			d[s] = 1;
		}
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += d[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
