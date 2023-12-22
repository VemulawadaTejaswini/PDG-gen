import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt(); //int Nに必要なものいれてね,
		
		//商品はどこであれ、1000円で割り切れるか確認したい。
		//1900円の場合、1000円で割り切れるか確認する
		//
		
		if (N % 1000 ==0) { //あまりが出る
			System.out.println(0);
		}else {
			System.out.println(1000-(N%1000));
		}
		
	}

}
