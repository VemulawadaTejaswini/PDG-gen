import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

public class Main {
//public class App {

    public static void main(String[] args){
     //スキャン
     Scanner s = new Scanner(System.in);
     // 入力
        long n = s.nextInt();
        long an = 0;
    for(long i = 1 ;i<=n;i++){

        if(i % 3 != 0  && i%5 !=0){
        an += i;
        }
        
    }
    System.out.println(an);
}

}