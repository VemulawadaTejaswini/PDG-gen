import static java.lang.System.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num[] = new int[count];
		for(int a = 0; a < count; a++) {
			int  b = sc.nextInt();
			num[a] = b;
		}
		for(int a = count - 1; a >= 0; a--) {
			if(a == 0) {
				out.println(num[a]);
			}else {
				out.print(num[a] + " ");
			}
		}
	}
}
