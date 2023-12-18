import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	
	//文字列sの入力
	String s =sc.next();
	
	//文字列pの入力
	String p =sc.next();
	
	
	//文字列sのループ化(2個接続すればOK？)
	String sr =new String(s+s);
	//System.out.println(sr);
	
	//文字列sに文字列pが含まれるかの判定(抽出)
	//抽出できたらYESできなかったらNOの振り分け
	
	if(sr.contains(p)) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	
	
	
	
	
	
	
	//出力
	
	
	
	}
	

}

