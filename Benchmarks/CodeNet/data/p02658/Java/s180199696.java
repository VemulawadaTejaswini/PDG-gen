import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        long An = 1;
        long temp =1;
        //final long answer=1;
        final long max = 1000000000000000000l;


        for(long i = 0; i < N; i++) {
            temp = sc.nextInt();
            if(temp == 0){
                System.out.println(0);
               return;
            }else{
                An = An * temp;
            }
        }
        if(An >max){
            System.out.println(-1);
            return;
        }
        System.out.println(An);

    }
}