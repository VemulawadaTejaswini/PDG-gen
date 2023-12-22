import java.io.*;
import java.io.IOException;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int  	n,
				x,
				a,			//1つ目の数
				b = 2,		//2つ目の数(ループの初期判定のために2で初期化)
				c = 3,		//3つ目の数(ループの初期判定のために3で初期化)
				count;	//組み合わせ数
		
		String[] input = new String[2];		//入力を受け取る配列
		String output = "";					//出力する文字列変数
		
		try{
			
			input = br.readLine().split("[\\s]+");		//入力
			
			while(true){
				n = Integer.parseInt(input[0]);
				x = Integer.parseInt(input[1]);
				
				//終了判定
				if(n == 0 && x == 0){		//2つのデータがすべて0の時に終了する
					break;
				}
				
				count = 0;
				for(a = 1;a < b;a++){			//aは最小値から徐々に+1していく
				
					for(b = a+1;b < c;b++){		//bはa+1からc-1まで+1していく
					
						for(c = n;c > b;c--){	//cは最大値から徐々に-1していく
						
							if(a + b + c == x){	//a,b,cの合計がxかどうか
							
								count++;		//組み合わせが見つかったためカウントアップ
							}
						}
						c = n;
					}
				}
				
				output += count + "\n";			//出力内容を入れる
				
				input = br.readLine().split("[\\s]+");	//2回目以降の入力
			}
		}catch(IOException e){
			System.out.println(e);
			return;
		}
		
		//出力
		System.out.print(output);
		
	}
}

