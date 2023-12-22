import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String S = sc.next();
        //整数の初期値０
		int num = 0;
        //１～４文字目を取り出す
		char[] ch = new char[4];
		for(int i=0; i<4; i++){
	 		ch[i] = S.charAt(i);
        }
        for(int i=0; i<4; i++){
          if(ch[i] == '+'){
        	num++;
          } else {
        	num--;
          }
        }
		// 出力
		System.out.println(num);
	}
}