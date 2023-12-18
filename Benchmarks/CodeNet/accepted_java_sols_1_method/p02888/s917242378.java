import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N];
		for(int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}

		Arrays.sort(list);

		int sum = 0;

		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					if(list[k] >= list[i] + list[j]) {
						break;
					}
					sum++;
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
