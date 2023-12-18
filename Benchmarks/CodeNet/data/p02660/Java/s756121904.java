import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt(); 


		// 出力
		System.out.println(primeFactorization(a));

	}
//素数判定メソッド
static boolean isPrime (int n) {
	if (n==2) return true;
	if (n<2 || n%2==0) return false;
	int d = (int)Math.sqrt(n);
	for (int i=3; i<=d; i+=2) {
		if(n%i==0){return false;}
	}
	return true;
}
	//素因数分解メソッド
static int primeFactorization (int n) {

	int total=0;
	int sq = (int)Math.sqrt(n);

	if (n == 1) {
		return total;
	}
	
	//nが素数ならn^1の形で返す
	if (isPrime(n) == true) {
		total++;
		return total;
	}

	for (int i=2; i<=sq; i++) {
		//n<iなら明らかにnをiで除算できないので終了（ループを余計に回さない）
		if (n < i) break;

		//iが素数なら、nをiで何回除算できるか、その回数をmapに記録する
		if (isPrime(i) == true) {
			int count = 0;
			if (n%i == 0) {
				n /= i;
				count++;
			}
			if (count > 0) {
				total++;
			}
		}

	}

	//2～sqrt(n)で除算した結果、なお残った数をmapに追加する
	if (n != 1) total++;

	return total;

}
}