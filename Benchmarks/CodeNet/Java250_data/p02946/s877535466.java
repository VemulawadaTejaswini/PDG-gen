import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		for(int i = 1; i <= 2 * k - 1; i++) {
			System.out.println(x - k + i);
		}
	}
}