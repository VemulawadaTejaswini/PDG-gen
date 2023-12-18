import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
		if(b / a > c) System.out.println(c);
		else System.out.println(b /a);
	}
}
