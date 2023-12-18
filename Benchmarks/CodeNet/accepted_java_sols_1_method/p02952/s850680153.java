
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//1 ~ 10^5 = 100000

		int count = 0;
		int N1000 = 90;//Nが999までなら
		int N10000 = 9090;//Nが9999までなら
		int N100000 = 9091;//Nが100000なら

		if(N < 10) {//1 ~ 9
			count = N;
		}else if(N < 100) {//10 ~ 99 = 90個
			count = 9;
		}else if(N < 1000) {//100 ~ 999
			count = N - N1000;
		}else if(N < 10000) {//1000 ~ 9999 = 9000個
			count = 909;
		}else if(N < 100000){//10000 ~ 99999
			count = N - N10000;
		}else {//100000 = 10^5
			count = 90909;
		}

		System.out.println(count);
	}

}
