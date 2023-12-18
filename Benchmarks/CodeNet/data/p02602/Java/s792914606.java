

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
      ArrayList<Integer> A = new ArrayList<Integer>();
      for(int i=0;i<N;i++){
            A.add(s.nextInt());
      }
      int counter = N-K;
      int now = 0;
      int bef =1;
      int aft =1;
      while(counter != now){

          if(now ==0){
            for(int i=0;i<K;i++){
                bef *= A.get(i+now);
                aft *= A.get(i+now+1);
            }
          }else{
            bef /=A.get(now-1);
            aft /=A.get(now);
            bef *=A.get(now+K-1);
            aft *=A.get(now+K);
          }
        now ++;
        if(bef<aft){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
      }
      
    

    
/*
     for(int i=0; i< K;i++){
        int di = Integer.pa rseInt(s.next());
        String blank = s.nextLine();
        String huge = s.nextLine();

        String[] hage = huge.split(" ",0);
        int hageN= hage.length;
        for (int num =0;num<hageN;num++){
            if(!hashSet.contains(hage[num])){
                hashSet.add(hage[num]);
            }
        }

     }
     s.close();

     System.out.println(N-hashSet.size());


}
*/
    }
}



