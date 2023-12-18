import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//スキャナー作る
		StringBuilder all = new StringBuilder();//合計用？変数
		StringBuilder out = new StringBuilder();//表示用変数
		
		while(true){//----------------------------------------------------------------------+
			int h = sc.nextInt();//縦取り込み
			int w = sc.nextInt();//横取り込み
			if((h + w) <= 0){break;}//入力が 0 0 なら 繰り返し終了 
				for(int j = 0; j < h; j++){//縦の計算-----------------------------------++
					for(int i = 0; i < w; i++){//横の計算//-----------------------+++
						out = out.append("#");//out に横の数ぶん＃格納
					}//-----------------------------------------------------------+++
					out = out.append("\n");//outに縦の数ぶん#格納
				}//---------------------------------------------------------------------++
			all = all.append(out + "\n");//格納した文字列と改行文字をallに格納
			out.delete(0, out.length());//outを初期化
		}//---------------------------------------------------------------------------------+
		System.out.print(all);//0 0が入力されループ抜けたのでallに格納された全てを表示
	}
}