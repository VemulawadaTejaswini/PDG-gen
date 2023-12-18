import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int aSave = a;
		int b = sc.nextInt();
		int c = sc.nextInt();
		for(int i =1; i <= b;i++) {
			if(a %b == c) {
				System.out.println("YES");
				return;
			}
			a += aSave;
		}
		System.out.println("NO");
	}
}