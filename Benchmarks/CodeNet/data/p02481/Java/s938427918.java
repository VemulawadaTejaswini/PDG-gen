import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int men;
		int syu;
		men = a * b;
		syu = (a + b) * 2;
		System.out.println(men);
		System.out.println(syu);
	}
}