
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i % 1000000007;
		}
		
		System.out.println(sum);
	}
}
