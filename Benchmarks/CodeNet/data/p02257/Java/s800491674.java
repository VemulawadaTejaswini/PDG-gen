import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new File("test_1.txt"));
		// Scanner sc = new Scanner(new File("test_2.txt"));
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			list.add(n);			
			if (n > max)
				max = n;
		}
		
		// ?´???°?????¨?????????
		List<Boolean> prime = new ArrayList<Boolean>();
		for (int i = 0 ; i < max + 1; i++)
			prime.add(true);
		for (int i = 2; i * i < prime.size(); i++) {
			if (prime.get(i))
				for (int k = 2; k * i < prime.size(); k++)
					prime.set(k * i, false);
		}
		
		int ans = 0;
		for (int n : list)
			if (prime.get(n))
				ans++;
		System.out.println(ans);
	}
}