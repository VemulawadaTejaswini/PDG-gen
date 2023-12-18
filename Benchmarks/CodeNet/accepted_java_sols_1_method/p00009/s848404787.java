import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static final int MAX = 999999;

	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		boolean[] notPrime = new boolean[Main.MAX];
		primeNumbers.add(2);
		for(int i = 3; i < Main.MAX; i += 2) {
			if(!notPrime[i]) {
				primeNumbers.add(i);
				for(int j = i + i; j < Main.MAX; j += i) {
					notPrime[j] = true;
				}
			}
		}
		while(scan.hasNext()){
			long n = scan.nextLong();
			int i = 0;
			for(i = 0; i < primeNumbers.size(); i++) {
				if(primeNumbers.get(i) > n) break;
			}
			System.out.println(i);
		}
	}
}