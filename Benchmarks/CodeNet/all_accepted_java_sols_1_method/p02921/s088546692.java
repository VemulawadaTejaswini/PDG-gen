	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int answer,index;
		String s,t;
		
			// 整数の入力
		
		s = sc.next();
		t = sc.next();
		sc.close();
		
		answer=0;
		for(index=0;index<3;index++) {
			if(s.substring(index,index+1).contentEquals(t.substring(index,index+1))) {
				answer=answer+1;
			}
		}
		System.out.print(answer);

			// 出力
 
	}
}