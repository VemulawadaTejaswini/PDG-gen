import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String str = buf.readLine();
			String[] input = str.split(" ");
			int W = Integer.parseInt(input[0]); // 長方形の横
			int H = Integer.parseInt(input[1]); // 長方形の縦
			int x = Integer.parseInt(input[2]); // 円の中心のx座標
			int y = Integer.parseInt(input[3]); // 円の中心のy座標
			int r = Integer.parseInt(input[4]); // 円の半径

			// はみ出ているか判定フラグの定義( true=長方形の中に収まっている, false=長方形の外にはみ出ている )
			Boolean Range = true;
			// 円の上下左右の値が高い点、低い点を割り出す

			// 円の最も低いx座標が0より大きいか判定
			// 円の最も低いy座標が0より大きいか判定
			// 円の最も高いx座標がWより小さいか判定
			// 円の最も高いy座標がHより小さい判定
			if( (x-r) < 0 || (y-r) < 0 || W < (x+r) || H < (y+r) ){
				Range = false;
			}

			if(Range){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		catch(IOException e){
			
		}
	}
}
