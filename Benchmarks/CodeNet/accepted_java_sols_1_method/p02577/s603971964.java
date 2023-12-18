

import java.util.Map.Entry;
import java.util.*;
 
//import org.w3c.dom.css.Counter;
 
public class Main {
//public class App {
 
    public static void main(final String[] args){
     //スキャン
     final Scanner s = new Scanner(System.in);
      //String N = Integer.parseInt(s.next());
      //int X = Integer.parseInt(s.next());
      //int T = Integer.parseInt(s.next());
      //int ans = N /X;
      String hoge = s.next();
      int huge = hoge.length();
      int hage = 0;
    for(int i =0;i<huge;i++){
        hage += Integer.parseInt(hoge.substring(i, i+1));
    }


      String ans ="Yes";
      if(hage%9 !=0){ans = "No";}
      System.out.println(ans);
      
    }
}
