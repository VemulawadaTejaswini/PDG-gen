import java.util.*;
import java.io.*;
import java.util.regex.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();	//キーボードで入力された１行目の文字を読み取る
        String t;
        int count = 0;
        
        while((t=br.readLine())!=null){
            if("END_OF_TEXT".equals(t) || w.length()>10 || t.length()>1000){
                break;                       //END_OF_TEXTが入力されたらwhileを抜ける
            }								 //又はwが10文字より大きいか、tの１行が1000文字より大きい場合はwhileを抜ける
            String[] str = t.split(" ");	//splitにより空白でtの１行が区切られたものをstrの配列に入れる
            for(int k=0; k<str.length; k++){
            	if(str[k].equalsIgnoreCase(w)){	//strの配列に入っているものとwを比較して
            		count++;					//同じだった場合はカウントをプラスしていく
            	}
            }
        }
        System.out.println(count);
     }
}