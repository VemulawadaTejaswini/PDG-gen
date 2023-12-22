import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int p[] = new int[n];
		int highPrice = 0;
		int pHighPrice = 0;
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			if(p[i] > highPrice) {
				highPrice = p[i];
				pHighPrice = i;
			}
		}
		int sum = 0;
		for(int j = 0; j < n; j++) {

			if(j == pHighPrice) {
				sum += highPrice / 2;
			} else {
				sum += p[j];
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
