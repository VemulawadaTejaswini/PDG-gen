import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextLong();
		List<Integer> li = new ArrayList<>();
		long i = 2;
		while(i <= N) {
			if(N % i == 0 && isPrime(i)) {
				int count = 0;
				while(N % i == 0) {
					count++;
					N /= i;
				}
				li.add(count);
			}
			i++;
		}
		int opeCount = 0;
		for(Integer in: li) {
			opeCount += getOneOpeCount(in);
		}
		System.out.println(opeCount);
	}
	public static boolean isPrime(long num) {
		for(long i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int getOneOpeCount(int i) {
		int count = 0;
		int j = 0;
		while(i > j) {
			i -= ++j;
			count++;
		}
		return count;
	}
}
