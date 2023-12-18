import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int aji = i + l;
			if (Math.abs(aji) < Math.abs(min)) {
				min = aji;
			}
			sum += aji;
		}
		System.out.println(sum - min);
	}
}
