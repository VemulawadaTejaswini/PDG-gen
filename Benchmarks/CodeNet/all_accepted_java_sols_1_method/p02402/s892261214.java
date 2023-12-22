import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 1000000, max = -1000000;
		long sum = 0;
		
		for (int i=0; i<n; i++) {
			int num = sc.nextInt();
			if (num < min) min = num;
			if (num > max) max = num;
			sum += num;
		}
		
		System.out.printf("%d %d %d\n",min, max, sum);
	}
}

