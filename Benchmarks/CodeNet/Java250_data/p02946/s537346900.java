import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		int a = X - K + 1;
		int b = X + K - 1;
		String c = "";
		while(a<=b) {
			c += a + " ";
			a++;
		}
		System.out.println(c);
	}

}