import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long n = Long.parseLong(sc.next());
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());

            long mod = n % (a + b);

            long ans = 0;
            if(mod <= a){
                ans = ((n - mod)/(a + b))*a + mod;
            }else{
                ans = ((n - mod)/(a + b))*a + a;
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}