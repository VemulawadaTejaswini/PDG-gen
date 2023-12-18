/*
  正規表現は、[〇〇]を文字列形式で与える！！
 */
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	String s = "";     // 生成中単語
	String x;          // 取得1文字
	String sent = "";  // 出力文章
	String in = kbd.nextLine(); // 入力文章

	int i;
	for(i=0; i<in.length(); i++){
	    x = in.substring(i, i+1);
	    if(!x.matches("[a-zA-Z]")){
		//System.out.println(x);
		if(s.equals("apple")){
		    s = "peach";
		}
		else if(s.equals("peach")){
		    s = "apple";
		}
		sent += (s+x);
		s = "";
	    }
	    else{
		s += x;
	    }
	}

	System.out.println(sent);
    }
}