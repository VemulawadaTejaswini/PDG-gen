import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		ArrayList<Long> multiArray = new ArrayList<>();
		
		// Nの平方根を取得
		long squareRoot= 1;
		for(long a = 1; a <= N; a++) {
			if(N < a * a) {
				squareRoot = a;
				break;
			}
		}
		
		// Nの約数の和を取得
		for(long i = 1; i <= squareRoot; i++) {
			if(N % i == 0 ) {
				multiArray.add(i + (N / i));
			}
		}

		// 和が最少となる約数を取得
		long culc = multiArray.get(0);
		for(int i = 0; i < multiArray.size(); i++) {
			if(multiArray.get(i) < culc) {
				culc = multiArray.get(i);
			}
		}
		
		// 和から２引いた結果を出力
		System.out.println(culc - 2);
		sc.close();
	}
}