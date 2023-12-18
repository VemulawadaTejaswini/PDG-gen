import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int
			TOTAL_CARDS = 52;					//カード総数
			
		final String[]
			MARK		= {"S","H","C","D"};	//絵柄
			
		//全種類のどのカードを所持しているかのフラグ
		boolean[] flagArray	= new boolean[TOTAL_CARDS];
		
		//所持カード枚数(入力レコード数)を記録
		int cardCount = Integer.parseInt(br.readLine());
		
		for(int i = 0;i < cardCount;i++){
			int arrayNum = 0;	//1~52の何番目か
			//所持カードの絵柄,数字の入力
			String[] input = br.readLine().split("[\\s]+");
			
			//絵柄と番号を1~52に対応させる
			for(int x = 0;x < MARK.length;x++){
				
				if(input[0].equals(MARK[x])){
					
					arrayNum = Integer.parseInt(input[1]) + (x * 13) - 1;
				}
			}
			//所持フラグの変更
			flagArray[arrayNum] = true;
		}
		
		//所持していなかったカードを表示させる
		for(int i = 0;i < flagArray.length;i++){
			
			if(flagArray[i] == false){
				
				//1~13までの数字に変換する
				int cardNum = i % 13 + 1;
				
				//出力
				System.out.println(MARK[i / 13] + " " + String.valueOf(cardNum));
			}
		}
	}
}

