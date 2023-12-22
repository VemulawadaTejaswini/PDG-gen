import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] d = new int[N];
		for(int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(d);
		int result = d[N/2] - d[N/2 - 1];
		System.out.println(result);
	}
}