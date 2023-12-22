import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int total = 0;
		for ( int i = 1; i < n; i++) {
			for ( int j = 1; j < n; j++) {
				if ( i * j < n) {
					total++;
				} else {
					break;
				}
			}
		}
		System.out.println(total);

	}

}
