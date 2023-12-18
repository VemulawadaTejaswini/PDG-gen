

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		if(a > b){
			long tmp = a;
			a = b;
			b = tmp;
		}

		if((b - a)%2 == 0){
			System.out.println(((b - a) + 1)/2);
		}
		else {
			if(a - 1 <= n - b){
				System.out.println((b + a)/2);
			}
			else {
				System.out.println((2*n - a - b + 1)/2);
			}
		}
	}

}
