import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] inputLine = line.split(" ");

		int totalDice = Integer.parseInt(inputLine[0]);
		int selectDice = Integer.parseInt(inputLine[1]);


		//与えられたダイスの配列を期待値配列に変換する
		line = sc.nextLine();
		inputLine = line.split(" ");
		double[] inputDiceArray = new double[totalDice];
		for(int i =0; i < totalDice; i++) {
			inputDiceArray[i]= Integer.parseInt(inputLine[i]);
		}
		double[] kitaichiArray = new double[totalDice];
		for(int i=0; i<totalDice; i++) {
			kitaichiArray[i]= (inputDiceArray[i]+1)/2;
		}

		//期待値配列を用いて、累積和で、期待値が最大となる隣接するK個の組み合わせを求める
		double maxKitaichi = 0;
		for(int i = 0; i < selectDice; i++) {
			maxKitaichi+=kitaichiArray[i];
		}
		double comp=maxKitaichi;
		for(int i=1; i<=totalDice-selectDice;i++) {
			comp=comp-kitaichiArray[i-1]+kitaichiArray[i+selectDice-1];
			maxKitaichi=Math.max(comp, maxKitaichi);
		}

		//最大組み合わせを標準出力
		System.out.println(maxKitaichi);
	}

}