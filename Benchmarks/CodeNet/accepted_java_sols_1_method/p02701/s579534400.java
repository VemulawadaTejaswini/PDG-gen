import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

public class Main {
//public class App {

    public static void main(final String[] args){
     //スキャン
     final Scanner s = new Scanner(System.in);
     HashSet<String> map = new HashSet<String>();
     final int ugeuge= Integer.parseInt(s.next());
      String tareget ="";

    for(int i=0;i < ugeuge ; i++){
        //Scanner hoge = new Scanner(System.in);
        //final String tareget = s.next();
        tareget= s.next();

        if(!map.contains(tareget)){
            map.add(tareget);
        }
    }
            System.out.println(map.size());
    }
}
