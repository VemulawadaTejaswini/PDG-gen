import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		java.util.Scanner sin = new java.util.Scanner(System.in);
		int a = sin.nextInt();
		int b = sin.nextInt();
		int ans1, ans2;
		if(1 <= a && b <= 100){
			ans1 = a * b;
			ans2 = 2 * a + 2 * b;
			System.out.println(ans1 + " " +ans2);
		}
	}
}
