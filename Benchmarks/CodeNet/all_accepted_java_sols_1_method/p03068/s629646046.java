import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字数の取得
		int a = sc.nextInt();
		// 文字列の取得
		String word = sc.next();
		// 指定インデックスの取得
		int c = sc.nextInt();
		
		//比較する文字の取り出し
		String base = word.substring(c-1, c);
		
		// base文字と違ったら"*"を返す
		for(int i = 0; i<a; i++){
			if(base.equals(word.substring(i,i+1))){
				System.out.print(word.substring(i,i+1));
			}else{
				System.out.print("*");
			}
		}
	}
}