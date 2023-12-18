import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, a = 0;;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			while(a%2==0) {
				a /= 2;
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}