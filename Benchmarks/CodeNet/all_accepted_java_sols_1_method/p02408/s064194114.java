import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		boolean[] 
				flagArray	= new boolean[52];		//全52種類のどのカードを所持しているかのフラグ
		int
				cardCount	= 0,					//所持カード枚数
				num		 	= 0;					//1~52のカードの何番目かを記録変数
		String[]
				input		= new String[2];		//入力(絵柄、数字)を格納する
				
		String 
				output		= "",					//出力する文字列
				mark[]		= {"S","H","C","D"};	//絵柄
				
		
		//所持カード枚数(入力レコード数)を記録
		cardCount = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<cardCount;i++){
			
			//所持カードの絵柄,数字の入力
			input = sc.nextLine().split("[\\s]+");
			
			//絵柄を1~52に対応させるための判定と番号計算
			for(int x = 0;x < mark.length;x++){
				
				if(input[0].equals(mark[x])){
					
					num = Integer.parseInt(input[1]) + (x * 13) - 1;
				}
			}
			//所持フラグの変更
			flagArray[num] = true;
			
		}
		
		//所持していなかったカードを表示させる
		for(int i=0;i<flagArray.length;i++){
			
			if(flagArray[i] == false){
				
				num = i % 13 + 1;
				output = mark[i / 13] + " " + String.valueOf(num);
				
				//出力
				System.out.println(output);
			}
		}
		
	}
}

