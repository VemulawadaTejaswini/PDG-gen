import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int shurui = sc.nextInt();  //商品の種類数
		double select = sc.nextInt();  //選びたい商品数
		double sum = 0;  //総投票数
		int shouhin[] = new int[shurui];  //商品配列

//	お菓子1つずつに得票数を記入
		for(int i=0 ; i<shurui ; i++) {
			int tokuhyou = sc.nextInt();
			shouhin[i] += tokuhyou;
			sum += tokuhyou;
		}

//	総投票数がわかったので基準値を求める
		double kijun = (sum/(4*select));

//	並列の中身を開けてみて、選べる商品をカウント
		int count = 0;
		for(int i : shouhin) {
			if(i >= kijun) {
				count ++;
			}
		}

//	選べる商品がM個以上あるかどうか
		System.out.println(count >= select ? "Yes" : "No");
	}
}