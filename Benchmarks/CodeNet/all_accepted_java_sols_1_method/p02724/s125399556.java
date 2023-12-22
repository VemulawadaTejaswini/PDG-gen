import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int num500 = x / 500;
		int num5 = (x - num500 * 500) / 5;
		System.out.println(num500*1000+num5*5);
		sc.close();
	}
}