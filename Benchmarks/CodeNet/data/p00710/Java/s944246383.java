import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int n = sc.nextInt();
				int r = sc.nextInt();
				if (n == 0 && r == 0) {
					break;
				}
				int[] numbers = new int[n];
				for (int i = 0; i < numbers.length; i++ ) {
					numbers[i] = i + 1;
				}
				int[] p = new int[r];
				int[] c = new int[r];
				for (int i = 0; i < p.length; i++) {
					p[i] = sc.nextInt();
					c[i] = sc.nextInt();
						int[] cp = new int[p[i] - 1];
						for (int j = 0; j < cp.length; j++) {
							cp[j] = numbers[n - 1 - j];
						}
						for (int j = 0; j < c[i]; j++) {
							numbers[n - 1 - j] = numbers[n - p[i] - j];
						}
						for (int j = 0; j < cp.length; j++) {
							numbers[n - c[i] - 1 - j] = cp[j];
						} 
				}
				System.out.println(numbers[n - 1]);
			}
		}
	}

}
