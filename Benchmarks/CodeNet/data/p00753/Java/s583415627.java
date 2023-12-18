import java.util.Scanner;
import java.util.BitSet;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		while(stdin.hasNext()){
			int n = stdin.nextInt();
			if (n == 0) break;
			System.out.println(primeNumberNums(n));
		}

		System.exit(0);
	}

	public static int primeNumberNums(int n){
		BitSet bs = new BitSet(n);
		for (int i = 2; i <= n; i++){
			int j = i;
			while(j <= n * 2){
				if (j > n) bs.set(j - n, true);
				j += i;
			}
		}
		return n - bs.cardinality();
	}
}