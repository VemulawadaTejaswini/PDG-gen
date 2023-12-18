import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 1000; i++) {
            int result = i * k;
            if (a <= result && result <= b) {
                System.out.println("OK");
                return;
			}
		}
			System.out.println("NG");
	}

}
