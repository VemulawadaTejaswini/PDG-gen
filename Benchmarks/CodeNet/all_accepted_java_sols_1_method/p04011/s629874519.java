import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int c = a - b;
		if(a > b) {
			int money1 = b * x;
			int money2 = c * y;
			int total = money1 + money2;
			System.out.println(total);
		}else {
			int total = a * x;
			System.out.println(total);
	}
}
}