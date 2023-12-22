import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int length = sc.nextInt();
		String[] str = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = sc.next();
		}

		Arrays.sort(str);
		for (int i = 0; i < num; i++) {
			System.out.print(str[i]);
		}
	}
}
