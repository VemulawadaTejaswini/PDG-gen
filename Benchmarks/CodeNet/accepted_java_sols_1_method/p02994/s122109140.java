import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int min = L;
		int sum = 0;
		
		for (int i = 1; i <= N; i++) {
			if (Math.abs(min) > Math.abs(L + i - 1)) {
				min = L + i - 1;
			}
			sum += L + i - 1;
		}
		System.out.println(sum - min);
	}
}