import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int i = 1;

		long mod = 0;

		if(k % 2 == 0 || k % 5 == 0) {
			System.out.println(-1);
		}else {
			do {
				mod *= 10;
				mod += 7;
				if(mod % k == 0) {
					System.out.println(i);
				}
				mod = mod % k;
					i++;
			}while(mod % k != 0);

		}

		scan.close();
	}
}
