import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a1 = scanner.nextInt();
		int min = a1;
		int max = a1;
		for (int i=1; i<n; i++){
			int a = scanner.nextInt();
			min = Math.min(min, a);
			max = Math.max(max, a);
		}
		System.out.println(max-min);
	}
}