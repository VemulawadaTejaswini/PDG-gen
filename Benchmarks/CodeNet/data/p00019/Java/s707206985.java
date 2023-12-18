import java.util.Scanner;

public class Main {

	// 階乗
	public static long factorial (int n) {
		long sum = 1;
		for (; n >= 2; n--)
			sum *= n;
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));

	}

}