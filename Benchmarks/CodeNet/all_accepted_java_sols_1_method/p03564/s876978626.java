import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int first = 1;
		for (int i = 0; i < n; i++) {
			if (first*2 >= first + k) {
				first += k;
			} else {
				first *=  2;
			}
		}
		System.out.println(first);
	}
}
