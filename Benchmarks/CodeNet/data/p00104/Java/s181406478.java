import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//編集用temp
		StringBuffer strbuf =new StringBuffer();

		//地図情報
		int xw;
		int yw;
		String maptmp;
		int map[];	//地図情報
		List<Integer> his = new ArrayList<>();	//通った情報
		int pos;	//今の位置

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			//ヘッダ読込み
			xw = sc.nextInt();
			yw = sc.nextInt();
			
			if (xw == 0 && yw==0) {
				break;
			}
			
			//地図情報読込み文字列(1次元)に変換する
			strbuf = new StringBuffer();	//init
			for (int i = 0 ; i <xw; i++) {
				strbuf.append(sc.next());
			}
			maptmp = strbuf.toString();
			
			//文字列(1次元)から、数値配列(1次元)に変換
			map = new int[xw * yw];
			for (int i = 0 ; i <xw*yw; i++) {
				String strtmp = maptmp.substring(i,i+1);
				int inttmp = 0;
				if (strtmp.equals("<")){
					inttmp = -1;
				}else if (strtmp.equals(">")){
					inttmp = 1;
				}else if (strtmp.equals("^")){
					inttmp = yw * -1;
				}else if (strtmp.equals("v")){
					inttmp = yw;
				}else if (strtmp.equals(".")){
					inttmp = 0;
				}
				map[i] = inttmp;
			}
			
			//移動処理
			pos  = 0;
			his = new ArrayList<>();
			
			while (true) {
				
				his.add(pos);
				pos = pos + map[pos]; 	


				//終了判定
				if (map[pos] == 0) {
					//出力
					System.out.println(String.valueOf(pos % xw) + " " + String.valueOf(pos / xw));
					break;
				}
				//loop判定
				if(his.contains(pos)) {
					//出力
					System.out.println("LOOP");
					break;
			            }

			}
			
			//テスト
			//System.out.println(Arrays.toString(map));
			//テスト
			//his.forEach(System.out::println);
		}
		System.out.print("");
	}
}
