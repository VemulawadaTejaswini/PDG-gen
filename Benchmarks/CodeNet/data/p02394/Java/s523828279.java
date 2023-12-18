// 2-D 長方形の中に円が含まれるかを判定するプログラムを作成してください。
// 次のように、長方形は左下の頂点を原点とし、右上の頂点の座標 (W,H)  が与えられます。
// また、円はその中心の座標 (x,y)  と半径 r  で与えられます。 

import java.util.*;


class Main{
	////プログラムのエントリポイント
	public static void main(String[] args){
		//入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		//数字５つ受け取り
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		//x-r<0 x+y > W 以外のときは縦軸からは出ない
		//y-r<0 y+r > H 以外のときは横軸からは出ない
		//よってこの条件に当てはまらない場合 円は（W.H)内側にある。
	
		if( x - r < 0 || y - r < 0 || x + r > W ||  y + r > H ){
			System.out.println("No");
		}else{
			System.out.println("Yes");      
		}
	}
}