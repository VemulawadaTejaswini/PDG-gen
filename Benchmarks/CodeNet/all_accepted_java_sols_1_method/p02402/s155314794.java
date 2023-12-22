import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		long max = array[0];
		long min = array[0];
		long sum = array[0];
		for(int i = 1; i < n; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
			sum += array[i];
		}
		System.out.printf("%d %d %d\n", min, max, sum);
		sc.close();
	}
}

