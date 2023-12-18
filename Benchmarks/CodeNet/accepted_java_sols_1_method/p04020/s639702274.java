
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		int flag = 0;

		for (int i=0; i < n;i++){
			long l = sc.nextLong();

			if (l%2 == 0) {
				if (flag == 1 && l != 0){
					ans += 1;
					l = l - 1;
					flag = 1;
				} else {
					flag = 0;
				}
				ans += l/2;

			} else {
				if (flag == 1) {
					ans += 1;
					flag = 0;
				} else {
					flag = 1;
				}
				ans += l/2;

			}
		}

		System.out.println(ans);
		sc.close();
	}

}
