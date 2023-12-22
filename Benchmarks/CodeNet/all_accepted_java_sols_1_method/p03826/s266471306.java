import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int s = 0;
		int s1 = a * b;
		int s2 = c * d;
		if(s1 >= s2) {
			s = s1;
		} else {
			s = s2;
		}
		System.out.println(s);
	}
}