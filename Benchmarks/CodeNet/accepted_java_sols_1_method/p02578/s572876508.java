
import java.util.Map.Entry;
import java.util.*;
 
//import org.w3c.dom.css.Counter;
 
public class Main {
//public class App {
 
    public static void main(final String[] args){
     //スキャン
     final Scanner s = new Scanner(System.in);
      //String N = Integer.parseInt(s.next());
      long N = Integer.parseInt(s.next());
      //int T = Integer.parseInt(s.next());
      //int ans = N /X;
      //String hoge = s.next();
      //int huge = hoge.length();
      //int hage = 0;
      int tmp = 0;
      long ans=0;
    for(long i =0;i<N;i++){
        int T = Integer.parseInt(s.next());
        if(tmp >T){
            ans += tmp -T;
        }else{
            tmp = T;
        }
    }
    System.out.println(ans);
    }
}