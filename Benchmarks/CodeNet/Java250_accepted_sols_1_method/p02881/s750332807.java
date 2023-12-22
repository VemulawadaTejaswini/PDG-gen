import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int pow2 = (int)Math.pow(n,0.5);
        for(int i = pow2; i > 0; i--){
            long il = (long)i;
            if(n % i == 0){
               System.out.println((il-1) + (n/il)-1);
               return;
            } 
        }
    }
}
