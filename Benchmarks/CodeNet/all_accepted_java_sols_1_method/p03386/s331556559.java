import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int k = scan.nextInt();
		for(int i = a; i <= b; i++) {
			if(i < a + k) {
				System.out.println(i);
			} else if(i > b - k) {
				System.out.println(i);
			}
		}
	}
}