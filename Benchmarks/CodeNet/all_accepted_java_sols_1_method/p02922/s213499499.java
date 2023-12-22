import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int a = sc.nextInt();
		int b = sc.nextInt();


		for (int i = 0; i <= 20; i++) {
			int now = 1 + (a-1)*i;
			if(now >= b){
				System.out.println(i);
				break;
			}
		}

	}
}
