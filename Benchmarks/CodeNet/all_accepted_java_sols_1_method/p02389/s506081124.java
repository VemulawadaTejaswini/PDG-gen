import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int l = a * 2 + b * 2;
		int s = a * b;
		System.out.println(s + " " + l);
	}
}
