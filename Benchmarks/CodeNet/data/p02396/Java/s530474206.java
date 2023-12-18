import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){

		//初期処理
		//Scanner sc = null;
		ArrayList array = new ArrayList();
		int number = 0;
		String str ="";
		int a =0;

		try{
		//do~while処理
		do{
			//テキスト入力クラス
			//sc = new Scanner(System.in);
			
			BufferedReader stdReader =
			        new BufferedReader(new InputStreamReader(System.in));
				
			//現在の入力値
			//number = sc.nextInt();
			str = stdReader.readLine();
			a = Integer.parseInt(str);
			//配列に追加
			//array.add(number);

		//入力結果が0になるまで入力
		}while(a != 0);
//		
//		//最後の配列を出力しないので、ループは配列の数より１回少ない
////		for(int i =1;i < array.size();i++){
////			//配列に格納されている結果を出力
////			System.out.println("Case "+i+": "+array.get(i-1));
////		}
		}catch(IOException e){}
	}
}