import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int k = sc.nextInt();
		if (k == 0)
			System.out.println(2);
		else if (k == 1)
			System.out.println(1);
		else{
		long a = 2, b = 1;

		for (int i = 2; i <= k; i++) {
			long tmp = a + b;
			a = b;
			b = tmp;
		}
		System.out.println(b);
		}
	}

}