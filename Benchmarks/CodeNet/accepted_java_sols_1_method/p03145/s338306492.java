import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		if(a*a==b*b+c*c) System.out.println(b*c/2);
		else if(a*a+b*b==c*c)System.out.println(a*b/2);
		else System.out.println();
		sc.close();
	}
}