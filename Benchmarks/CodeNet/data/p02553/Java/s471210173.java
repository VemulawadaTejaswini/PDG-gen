import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		int max =0;
		
		for (int i = a; i < b; i++) {
			for (int l = c; l < d; l++) {
				int temp = i*l;
				max = Math.max(max, temp);
			}
		}

		System.out.println(max);
	}
}
