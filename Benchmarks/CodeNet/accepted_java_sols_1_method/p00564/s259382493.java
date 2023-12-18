import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//値分割(購入本数、セットＸの本数と金額、セットＹの本数と金額)
		double buyCount = sc.nextDouble();
		double XsetCount = sc.nextDouble();
		double XsetPrice = sc.nextDouble();
		double YsetCount = sc.nextDouble();
		double YsetPrice = sc.nextDouble();

		//購入本数＜Ｘセット本数　金額
		double XsumPrice = XsetPrice * Math.ceil(buyCount/XsetCount);

		//購入本数＜Ｙセット本数　金額
		double YsumPrice = YsetPrice * Math.ceil(buyCount/YsetCount);

		//金額が小さい方を出力
		if(XsumPrice < YsumPrice) {
			System.out.println((int)XsumPrice);
		}else {
			System.out.println((int)YsumPrice);
		}
		
		sc.close();
	}
}
