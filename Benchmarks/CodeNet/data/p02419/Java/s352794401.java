import java.util.*;
import java.io.*;
import java.util.regex.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String w = br.readLine();	//キーボードで入力された１行目の文字を読み取る
        String t;
        String upper;
        String lower;
        int count = 0;
        int i = 0;
        int j = 0;
        
        while((t=br.readLine())!=null){
            if("END_OF_TEXT".equals(t)){
                break;                       //END_OF_TEXTが入力されたらwhileを抜ける
            }
            upper = t.toUpperCase();         //入力された文字を大文字に変える
            lower = t.toLowerCase();         //入力された文字を小文字に変える
            if(upper.indexOf(w) != -1){
               count++;
               i = upper.indexOf(w);
               for(; j<w.length(); j++){
                   if(upper.indexOf(w) != -1 && upper.indexOf(w,i+1) != -1) count++;
               }
            }
            if(lower.indexOf(w) != -1){
               count++;
               i = lower.indexOf(w);
               if(lower.indexOf(w,i+1) != -1) count++;
            }
        }
        System.out.println("count"+count);
     }
}