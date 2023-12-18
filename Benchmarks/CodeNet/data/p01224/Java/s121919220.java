import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			long sum = 0;
			for(int i=1;i*i<=n;i++) {
				if (i * i == n) {
					sum += i;
					break;
				}
				if (n % i == 0) {
					sum += i + n / i;
				}
			}
			sum -= n;
			if (n == sum) {
				System.out.println("perfect number");
			}else if(n > sum) {
				System.out.println("deficient number");
			}else{
				System.out.println("abundant number");
			}
		}
	}

}