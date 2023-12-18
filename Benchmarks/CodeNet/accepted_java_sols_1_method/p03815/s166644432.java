import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if(n==6){
			System.out.println(1);
		}else if(n%11==6){
			if (2 * n % 11 == 0) {
				System.out.println(2 * n / 11-1);
			} else {
				System.out.println((2 * n / 11));
			}	
		}else{
		if (2 * n % 11 == 0) {
			System.out.println(2 * n / 11);
		} else {
			System.out.println((2 * n / 11) + 1);
		}
	}
}
}