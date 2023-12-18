//8-D
//文字列関数で探し易くするために、検索対象となる文字列 s を加工してみましょう。
//String s を String s にくっつける！！！！！

import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.next();//判定される
    	String p = sc.next();//判定する
    	
    	//入力された判定される側を同じ物どおしでくっつける
    	//問題のサンプルだと　vanceknowledtoad  なので
    	//vanceknowledtoad　＋　vanceknowledtoad　= vanceknowledtoadvanceknowledtoad
    	//簡単に判定できる！ただしリングだけに通用する。
    	s = s.concat(s);
    	
    	//indexOfで判定して文字がなければ -1 がかえってくる。
        int num = s.indexOf(p);
         
        if(num != -1){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}