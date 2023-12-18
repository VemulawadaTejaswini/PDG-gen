
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = Integer.valueOf(s.next());
        int ac = 0;
        int wa = 0;
        int tle =0;
        int re =0;
        for(int i=0;i<N;i++){
            String hoge = s.next();
            if(hoge.equals("AC")){
                ac++;
            }else if(hoge.equals("WA") ){
                wa++;
            }else if(hoge.equals("TLE")){
                tle++;
            }else{
                re ++;
            }
        }

        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+ re);

        
        //部下持ち数
        /* int hoge=N-K+2;
		for(int i = K; i <= N+1; i++) {
            for(int i2 =0; i2<= i-1;i2++){
                hoge += N-(2*i2);50
            }
        } */

        

    }
}
    


    