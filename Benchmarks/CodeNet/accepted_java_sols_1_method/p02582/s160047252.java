import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力(スペース改行関係なし)
		String s = sc.next();

		if(s.contains("RRR")){
			// 出力
			System.out.println(3);
		}else if(s.contains("RR")){
			System.out.println(2);
		}else if(s.contains("R")){
			System.out.println(1);
		}else{
        	System.out.println(0);
        }
		
	}
}