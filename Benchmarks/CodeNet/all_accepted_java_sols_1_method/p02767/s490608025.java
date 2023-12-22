import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int people = sc.nextInt();
		long anser = 0;
		long max =  1000000000000000000l;
		int[] hp = new int[people];
		for(int num = 0 ; num <people; num++) {
			hp[num] = sc.nextInt();
		}
		//座標場所で一番最小のところ。
			for(int num = 0; num < 100; num++) {
				//最小を探すために毎回初期化
				anser = 0;
				for(int i = 0 ; i < people; i++) {
					//(x-p)2乗　公式
					//住人の座標-開催場所の座標
					anser +=(hp[i]-num) * (hp[i]-num);
				}
				if(max > anser) {
					max = anser;
				}
			}
		System.out.println(max);

	}
}
