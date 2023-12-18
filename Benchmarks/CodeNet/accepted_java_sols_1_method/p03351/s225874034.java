import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		int diffAB = (a>b)?a-b:b-a;
		int diffBC = (b>c)?b-c:c-b;
		int diffAC = (a>c)?a-c:c-a;
		System.out.println(((diffAB<=d && diffBC<=d) || diffAC<=d)?"Yes":"No");
	}
}