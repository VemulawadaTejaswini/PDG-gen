
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans=1;
        long q =2;

        if(N==1){
            System.out.println(0);
            return;
        }

        while(q*q<N){
            if(N%q ==0){
                N = N/q;
                ans ++; 
            }
            q++;
        }
       
            System.out.println(ans);
    }
}