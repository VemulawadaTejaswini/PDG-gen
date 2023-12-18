import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

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
		HashSet checked = new HashSet();
		ArrayList primenums = new ArrayList();
		for (int i = 2; i <= n; i++){
			int j = 1;
			int k;
			while((k = i * j) <= n * 2){
				if (k > n) checked.add((short)k);
				j++;
			}
		}
		for (int i = n; i <= 2 * n; i++) {
			if (! checked.contains((short)i)){
				primenums.add((short)i);
			}
		}
		return primenums.size();
	}
}