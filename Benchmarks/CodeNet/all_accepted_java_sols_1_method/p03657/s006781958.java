import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		if((a+b)%3==0 || a%3==0 || b%3==0) {
			System.out.println("Possible");
		}else {
			System.out.println("Impossible");
		}

	}
}


