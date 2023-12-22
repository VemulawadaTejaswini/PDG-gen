import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		//サイコロの面の数
		int N = scanner.nextInt();
		//勝ち得点
		int K = scanner.nextInt();
		//サイコロを振る数
		int count;
		//各サイコロの目のときの確率
		double p = 0;
		//答え
		double answer = 0;
		
		//サイコロの目でループ
		for(int i = 1; i <= N; i++){
			count = i;
			p = 1.0/N;
				//サイコロの目が勝ち得点を超えるまでループ
				while(count < K){
					count *= 2;
					p /= 2.0;
				}
				answer += p;
		}
		System.out.println(answer);
	}
}