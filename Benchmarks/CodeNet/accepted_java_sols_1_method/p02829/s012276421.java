import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 1; i <= 3; i++) {
			if(i!=a && i!=b) {
				System.out.println(i);
			}
		}
	}
}