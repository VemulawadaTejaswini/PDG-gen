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
        while((t=br.readLine())!=null){     
            upper = t.toUpperCase();
            lower = t.toLowerCase();
            if(upper.indexOf(w) != -1){
        	   count++;
               i = upper.indexOf(w);
               for(int j=0; j<w.length(); j++){
                   if(upper.indexOf(w) != -1 && upper.indexOf(w,i+1) != -1){
                       count++;
                   }
               }
            }else if(lower.indexOf(w) != -1){
                count++;
                i = lower.indexOf(w);
                for(int j=0; j<w.length(); j++){
                    if(lower.indexOf(w) != -1 && lower.indexOf(w,i) != -1){
                        count++;
                        
                    }
                }
            }
        }
        System.out.println(count);
     }
}