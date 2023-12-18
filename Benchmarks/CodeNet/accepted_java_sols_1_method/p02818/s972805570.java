import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		if(k>a) {
			if(k-a>b) {
				System.out.println("0 0");
			}else {
				System.out.println("0 " + (b-(k-a)));
			}
		}else {
			System.out.println(a-k + " " + b);
		}
	}
}
