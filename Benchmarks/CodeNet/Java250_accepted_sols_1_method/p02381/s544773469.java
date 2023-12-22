import java.util.Scanner;

public class Main{
	public static void main(String[] args){		
		//データの入力の準備
		Scanner sc = new Scanner(System.in);
		
		while (true){
			int num;
			double sum = 0;
			double ave;
			double bunsan = 0;
			
			num = sc.nextInt();
			
			//終了条件の判定
			if (num == 0){
				break;
			}
		
			//データ格納用配列
			double[] datas = new double[num];
		
			//データの入力
			for (int i = 0; i < num;i++){
				double temp = sc.nextDouble();
				sum += temp;
				datas[i] = temp;
			}
		
			//平均を求める
			ave = sum / num;
		
			//分散を計算
			for (int i = 0; i < num; i++){
				bunsan += Math.pow((datas[i] - ave), 2);
			}
			bunsan /= num;
		
			System.out.printf("%f\n",Math.sqrt(bunsan));
		}
	}
}
