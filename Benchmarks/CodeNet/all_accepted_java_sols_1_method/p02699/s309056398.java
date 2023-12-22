
import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

public class Main {
//public class App {

    public static void main(String[] args){
     //スキャン
     Scanner s = new Scanner(System.in);
       // 入力
       int n = Integer.parseInt(s.next());
       int n2 =Integer.parseInt(s.next());
        if(n <= n2){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
    }
}