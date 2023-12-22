

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			long a = scanner.nextInt();
			long b = scanner.nextInt();
			long m = a ;
			long n = b ;
			while(m % n != 0){
				long tmp = m;
				m = n;
				n = tmp % n;
			}
			//最大公約数
			long  GCD = n;
			//最小公倍数
			long  LCM = a * b / GCD;

			System.out.printf("%d %d\n", GCD, LCM);
		}
		scanner.close();
	}

}

