
import java.util.Map.Entry;
import java.util.*;
 
//import org.w3c.dom.css.Counter;
 
public class Main {
//public class App {
 
    public static void main(final String[] args){
     //スキャン
     final Scanner s = new Scanner(System.in);
      int N = Integer.parseInt(s.next());
      int K = Integer.parseInt(s.next());
      ArrayList<Long> A = new ArrayList<Long>();
      for(long i=0;i<N;i++){
            A.add(s.nextLong());
      }
      //出力回数
      int counter = N-K;
      //今何回出力したか
      int now = 0;
      //比較対象１
      long bef =1;
      //比較対象2
      long aft =1;
      while(counter > now){
        //初回のみこっち
        

            //befだけが持つやつ
            bef = A.get(now);
            //aftに増えるやつ
            aft = A.get(now+K);
          
        //カウントアップ
        now ++;
        if(bef<aft){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
      }
    }
}