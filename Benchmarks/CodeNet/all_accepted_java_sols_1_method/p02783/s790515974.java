import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int a = sc.nextInt();
		int count=1;

		while(h>a) {
			h -= a;
			count++;
		}

		System.out.println(count);
		sc.close();
	}
}
