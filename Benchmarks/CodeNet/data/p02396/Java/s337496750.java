import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int i = 1;
		while (true) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == 0) break;
			System.out.println("Case %d: %d", i, num);
			i ++;
		}
	}
}