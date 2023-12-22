import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		boolean flg = false;

		for (int i = 1; i <= 9; i++) {
			if (A % i == 0) {
				if (1 <= A / i && A / i <= 9) {
					System.out.print("Yes");
					flg = true;
					break;
				}
			}
		}
		if (!flg) {
			System.out.print("No");
		}

	}
}
