import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int target = 0;
		int amari = 0;
		if(a > b) {
			amari = b + c;
			target = a;
		} else {
			amari = a + c;
			target = b;
		}
		if (target < c) {
			amari = a + b;
			target = c;
		}
		for(int i = 0; i < x; i++) {
			target *= 2;
		}
		System.out.println(target + amari);
	}
}