import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		int x = n / 7;
		while (x >= 0) {
			if ((n - 7 * x) % 4 == 0) {
				flag = true;
				break;
			}
			x -= 1;
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
