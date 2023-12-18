import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =sc.nextInt();
		if(a%2==1 && b%2==1 && c%2==1)
		System.out.println(Math.min((long) a*b, Math.min((long) b*c, (long) a*c)));
		else
			System.out.println(0);
	}
}
