import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		x-=a;
		
		while(x-b>=0) {
			x-=b;
		}
		System.out.println(x);
	}
}