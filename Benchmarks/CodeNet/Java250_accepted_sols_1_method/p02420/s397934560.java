import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while (true){
			//文字列のリスト
			ArrayList<Character> list = new ArrayList<Character>();
		
			//データ入力
			String input = sc.next();
			
			//終了条件の判定
			if (input.equals("-") == true){
				break;
			}
		
			//データをリストに格納
			for (int i = 0; i < input.length(); i++){
				list.add(input.charAt(i));
			}
			
			//データのシャッフル
			int m = sc.nextInt();//シャッフルの回数
			for (int i = 0; i < m; i++){
				//次のシャッフル位置
				int h = sc.nextInt();
				
				//シャッフル
				ArrayList<Character> subList = new ArrayList<Character>();
				for (int j = 0; j < h; j++){
					char temp = list.get(0);
					list.add(temp);
					list.remove(0);
				}
			}
			
			//結果を出力
			for (char c : list){
				System.out.print(c);
			}
			System.out.print("\n");
			
		}
		
	}
}
