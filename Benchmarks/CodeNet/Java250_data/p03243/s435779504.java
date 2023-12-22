import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = n;
		for (; i <= 999; i++) {
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;
			
			if (a == b && b == c && c == a) break;
		}
		
		System.out.println(i);
		
		sc.close();
	}
}


