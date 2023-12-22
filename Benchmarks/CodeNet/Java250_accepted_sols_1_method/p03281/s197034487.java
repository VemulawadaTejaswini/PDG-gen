import java.util.*;
 
class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;
		
		//Nまでの奇数をとる
		for (int i = 1; i <= N; i+=2) {
			//divを初期化
			int div = 0;
			//約数の計算
			for (int j = 1; j <= i; j++) {
				if(i%j == 0) {
					div++;
				}
			}
			//System.out.println(i + "の約数 : " + div + "個");
			
			//div==8のときのみ、countに追加
			if (div == 8) {
				count++;
			}
		}
		System.out.println(count);
	}
}