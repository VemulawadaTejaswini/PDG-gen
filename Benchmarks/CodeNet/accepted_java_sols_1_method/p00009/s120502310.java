
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SortedSet<Integer> primes = new TreeSet<Integer>();
		primes.add(2);
		primes.add(3);
		int max = 3;
		while (in.hasNext()) {
			int val = in.nextInt();
			if (max < val) {
				label: for (int cVal = max + 2; cVal <= val; cVal = cVal + 2) {
					int pre = 1;
					int canCheckVal = 1;
					max = cVal;
					for (int prime : primes) {
						canCheckVal = pre * prime;
						if (cVal % prime == 0) {
							continue label;
						}
						if (cVal < canCheckVal) {
							break;
						}
						pre = prime;
					}
					primes.add(cVal);
				}
			}
			int count = primes.headSet(val + 1).size();
			System.out.println(count);

		}
	}
}