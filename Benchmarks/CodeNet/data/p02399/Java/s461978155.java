import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f", 1.0*a/b); //?°???°?????\???5????????????
		System.out.println(d + " " + r + " " + f);
	}

}