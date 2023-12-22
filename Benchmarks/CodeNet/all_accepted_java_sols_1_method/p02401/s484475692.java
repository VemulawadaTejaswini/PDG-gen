import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			// 入力ストリームの生成
			while(true){
			// 無限ループ
				String ans = br.readLine();
				// 入力文字を出力
				StringTokenizer stk = new StringTokenizer(ans," ");
				// 入力文字ansを” ”で区切ってstへ代入
				int a = Integer.parseInt(stk.nextToken());
				// ” ”で区切られた文字をint型に変換してaに代入
				String op = stk.nextToken();
				// ” ”で区切られた文字（符号）をopに代入
				int b = Integer.parseInt(stk.nextToken());
				// ” ”で区切られた文字をint型に変換してbに代入

				if(op.equals("?")) break;
				// opが”?”と等しい場合、処理を抜ける
				if(0 <= a && a<=20000
					&& 0 <= b && b<=20000){
				// aが0以上20000以下かつbが0以上20000以下
					if(op.equals("+")){
					// opが”+”の場合、下記出力して処理を抜ける
						System.out.printf("%d\n",a+b);
					}else if(op.equals("-")){
					// opが”-”の場合、下記出力して処理を抜ける
						System.out.printf("%d\n",a-b);
					}else if(op.equals("*")){
					// opが”*”の場合、下記出力して処理を抜ける
						System.out.printf("%d\n",a*b);
					}else if(op.equals("/")){
					// opが”/”の場合、下記出力して処理を抜ける
						System.out.printf("%d\n",a/b);
					}
				}
			}
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}