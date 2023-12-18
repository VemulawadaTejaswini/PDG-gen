import java.util.Scanner;
import java.util.Vector;


public class Main {

	public static void main(String[] args) {

//		入力を取得
		Scanner inputData = new Scanner(System.in);
		
//		可変長配列Aを生成
		Vector<Integer> vecA = new Vector<Integer>();
//		最初の数値qの回数だけ処理を反復
		int q = 0;
		if(inputData.hasNext()) {
			q = inputData.nextInt();
		}
		for(int index=1; index<=q; index++) {
//		各数値(0，1，2)毎に処理を分岐
			int action = 0;		// 動作割り当て数値
			int param = 0;		// 動作に紐づいたパラメータ
			action = inputData.nextInt();
			switch(action) {
//				0の場合、Aに数値xを追加
				case 0:
					param = inputData.nextInt();
					vecA.add(param);
					break;
//				1の場合、Aのp番目の要素を出力
				case 1:
					param = inputData.nextInt();
					System.out.println(vecA.get(param));
					break;
//				2の場合、Aの末尾の要素を削除
				case 2:
					vecA.remove(vecA.size() - 1);
					break;
				default	:
						break;
						
			}
			
		}
		inputData.close();

	}

}


