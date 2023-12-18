import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int tmp;

		while((tmp = x%y)!= 0) {
			x =y;
			y = tmp;
		}
		System.out.println(y);
	}
}
