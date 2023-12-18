import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N+1];

		data[0] = 0;
		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			data[a] = i;
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(data[i]+" ");
		}
	}
}