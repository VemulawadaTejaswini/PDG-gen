import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		if(k > a) {
			System.out.printf("0 %d",Math.max(b-(k-a),0));
		}else {
			System.out.printf("%d %d",a-k,b);
		}
		sc.close();
	}
}