import java.io.*;

public class Main{
	public static void main(String[] args){
		try {
			int W,H,x,y,r;
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			//キーボード入力を受け取る	
			String str = br.readLine();
			//キーボード入力した文字列を変数ｓｔｒへ代入
			String[] strAry = str.split(" ");
			//文字列をsplitメソッドを使い、空白で分割する
			//配列を生成する

			W = Integer.parseInt(strAry[0]);
			//Wにキーボード入力の要素[0]を代入する
			H = Integer.parseInt(strAry[1]);
			//Wにキーボード入力の要素[1]を代入する
			x = Integer.parseInt(strAry[2]);
			//Wにキーボード入力の要素[2]を代入する
			y = Integer.parseInt(strAry[3]);
			//Wにキーボード入力の要素[3]を代入する
			r = Integer.parseInt(strAry[4]);
			//Wにキーボード入力の要素[4]を代入する

			//長方形の中に円が含まれるかをif文で判定する
			if(x-r>=0 && x+r<=W &&
					y-r>=0 && y+r<=H){
			//xに関してはx-rをした際に-になると左枠を超える
			//wより横軸x＋rが大きくなると上枠を超える
			//y-rをした際に-になると右枠を超える
			//hより横軸y＋rが大きくなると下枠を超える

				System.out.println("Yes");
				//条件と一致した場合Yesを出力
			}else{
				System.out.println("No");
				//条件と異なる場合はNoを出力
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}