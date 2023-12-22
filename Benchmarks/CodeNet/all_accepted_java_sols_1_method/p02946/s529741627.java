import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		StringBuilder str = new StringBuilder();

		int min = X - K + 1;
		int range = K * 2 - 1;
		for(int i=0; i<range; i++) {
			str.append(min + i);
			str.append(" ");
		}
		sc.close();
		System.out.println(str);
	}
}