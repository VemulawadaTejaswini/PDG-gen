import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		int j = h % a;
		if (j == 0) {
			System.out.println(h / a);
		} else {
			System.out.println(h / a + 1);
		}

	}

}