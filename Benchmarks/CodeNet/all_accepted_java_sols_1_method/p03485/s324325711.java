import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ave = (a + b) / 2;
		if((a + b) % 2 != 0) {
			ave++;
		}
		System.out.println(ave);
	}
}