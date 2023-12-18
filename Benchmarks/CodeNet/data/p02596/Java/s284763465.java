import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();

		long x = 0;
		for (int i=1; i<=k; i++){

			x = x * 10 + 7;

			if (x % k ==0){
				System.out.println(i);
				return;
			}
			x %= k;
		}

		System.out.println("-1");
	}


}