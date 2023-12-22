import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

public class Main {
//public class App {

    public static void main(String[] args){
     //スキャン
     Scanner s = new Scanner(System.in);
     // 入力
        int n = s.nextInt();
        if(n /100 == 7 || n % 100 /10 ==7 || n%10 ==7){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    
    }
  
}
