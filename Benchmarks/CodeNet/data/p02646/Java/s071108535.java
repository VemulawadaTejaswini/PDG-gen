import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);
        long A =sc.nextInt();
        long V =sc.nextInt();
        long B =sc.nextInt();
        long W =sc.nextInt();
        long T =sc.nextInt();
        long div = Math.abs(A-B);
        long run = V-W;
        long ans =div -(run*T);
        if(ans>0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
} 