import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans=0;
        long q =2;
        long keep =N;
 
        if(N==1){
            System.out.println(0);
            return;
        }
 
        while(q*q<=N){
            if(N%q ==0){
                //N = N/q;
                //ans ++;
                for(int i = 1; N>=Math.pow(q,i);i++){
                    if(N%Math.pow(q, i)==0){
                        ans++;
                        N = (long) (N / Math.pow(q, i));
                    }
                }
                while(N%q ==0){
                    N = N/q;
                }
            }   
            q++;
        }
        if(N != 1){ans++;}
       
            System.out.println(ans);
    }
}
