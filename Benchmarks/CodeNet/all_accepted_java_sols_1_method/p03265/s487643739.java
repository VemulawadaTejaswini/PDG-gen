import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int c1 = b1 - (b2 - a2);
		int c2 = b2 + (b1 -a1);
		int d1 = a1 - (b2 - a2);
		int d2 = a2 + (b1 - a1);

		System.out.println(c1 + " " + c2 + " " + d1 + " " + d2);

	}
}