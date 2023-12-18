import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力(スペース改行関係なし)
		String a = sc.next();

		if(Character.isUpperCase( a.charAt( 0 ) )){
			// 出力
        	System.out.println("A");
		}else{
			System.out.println("a");
		}
		
	}
}