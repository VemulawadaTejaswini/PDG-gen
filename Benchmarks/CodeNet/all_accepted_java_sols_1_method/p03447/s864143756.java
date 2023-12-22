import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		x-=a;
		System.out.println(x%b);
	}
}
