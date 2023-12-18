import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//サイコロの面の数
		int K = sc.nextInt();	//得点
		double d = 0.0;	//勝つ確率
		int coin = 0;	//コインの回数記録
		int calc = 0;	//コインの回数計算
		for(int i = 1; i <= N; i++) {
			calc = i; coin = 0;
			for(;calc < K;coin++) calc *= 2;
			d += (1.0/N) * Math.pow((1.0/2), coin);
		}
		System.out.println(d);
	}

}