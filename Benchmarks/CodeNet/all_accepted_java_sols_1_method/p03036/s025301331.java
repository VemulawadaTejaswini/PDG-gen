import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int d = sc.nextInt();
		int x0 = sc.nextInt();
		int x1;
		for(int i=0; i<10; i++) {
			x1 = r * x0 - d;
			System.out.println(x1);
			x0 = x1;
		}
	}
}