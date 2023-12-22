import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int dif = b - a;
		dif += 1;
		for(int i = 0; i < dif; i++) {
			if(a % k == 0) {
				System.out.println("OK");
				return;
			}
			a++;
		}
		System.out.println("NG");

	}

}