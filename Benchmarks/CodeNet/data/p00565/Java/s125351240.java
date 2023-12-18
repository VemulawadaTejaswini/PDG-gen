import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//１つ目はすごろくのマス
		int masu = sc.nextInt();

		//マス分の数字を取得
		List<Integer> masuList = new ArrayList<Integer>();
		for(int i=0; i<masu; i++) {
			masuList.add(sc.nextInt());
		}

		//出た目リスト作成
		List<Integer> meList = new ArrayList<Integer>();
		int memory = 0;
		for(int k=0; k<masu; k++) {
			memory++;

			//0でリストに入れる
			if(masuList.get(k) == 0) {
				meList.add(memory);
				memory = 0;
			}else if(k == masu -1) {//最後の処理
				meList.add(memory+1);
			}
		}

		//一番大きい数字を取り出す
		int ret = 0;
		for(int l=0; l<meList.size(); l++) {
			if(ret<meList.get(l)) {
				ret = meList.get(l);
			}
		}

		//結果出力
		System.out.println(ret);//スタートマスをプラス
		sc.close();
	}
}
