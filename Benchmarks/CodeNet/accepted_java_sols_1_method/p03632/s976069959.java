import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int time = 0;
		for (int i = 0; i <= 100; i++) {
			if (a <= i && c <= i && i < b && i < d) time++;
		}
		
		System.out.println(time);
		
		sc.close();
	}
}


