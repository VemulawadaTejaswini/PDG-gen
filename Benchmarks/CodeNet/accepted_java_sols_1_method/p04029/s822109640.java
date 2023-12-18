import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N = 0;
		int candy = 0;
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		for(int i = 1; i <= N; i++) {
			candy += i;
		}
		System.out.println(candy);
	}
}