import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] list = new long[n];
		long max = 0;
		long sum = 0;

		for(int i = 0; i < n;i++) {
			list[i] = scan.nextLong();
		}

		for(int i = 0;i < n;i++) {
			if(list[i] >= max) {
				max = list[i];
			}else {
				sum += max - list[i];
			}
		}

		System.out.println(sum);
	}
}
