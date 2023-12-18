import java.io.*;
import java.io.IOException;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = new String[100]; //入力を受け取る変数
		String output = "";	//出力する文字列を代入する変数
		int 	r,	//行数の変数
				c;	//列数の変数
		
		try{
			input = br.readLine().split("[\\s]+");	//1行目の入力
			
			r = Integer.parseInt(input[0]);	//行数(入力レコード数)を記録
			c = Integer.parseInt(input[1]);	//列数を記録
			
			int table[][] = new int[r+1][c+1];	//表の内容を記録する変数
			
			for(int y = 0;y < r;y++){	//入力レコード数分繰り返す
			
				input = br.readLine().split("[\\s]+");	//2行目以降の入力
				
				for(int x = 0;x < c;x++){	//列数分繰り返す
				
					table[y][x] = Integer.parseInt(input[x]);	//x列目のデータを格納
					
					table[y][c] += table[y][x];	//最後列(行の合計)に値を加算
				}
			}
			
			//最下行(列の合計)の計算
			for(int x = 0;x < c+1;x++){	//条件x < c+1は最後の行合計値を表全体の合計に代入するため
			
				for(int y = 0;y < r;y++){
					
					table[r][x] += table[y][x];	//最下行(列合計)に値を加算
				}
			}
			
			//出力用のループ
			for(int y = 0;y < r+1;y++){
				
				for(int x = 0;x < c+1;x++){
					
					output += table[y][x] + " ";	//出力する数字+スペースを末尾に足す
				}
				System.out.println(output.substring(0, output.length()-1));	//無駄に挿入されたスペースを取り除き出力する
				output = "";
			}
		}catch(IOException e){
			System.out.println(e);
			return;
		}
	}
}

