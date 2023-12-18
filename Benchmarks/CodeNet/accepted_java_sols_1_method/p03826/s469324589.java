import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int ans1 = a * b;
		int ans2 = c * d;
		if(ans1 < ans2) {
			System.out.println(ans2);
		}else {
			System.out.println(ans1);
		}
	}
}