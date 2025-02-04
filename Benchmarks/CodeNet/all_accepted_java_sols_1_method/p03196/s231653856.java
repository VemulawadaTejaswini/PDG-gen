import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long P = sc.nextLong();
        sc.close();

        if(N == 1){
            System.out.println(P);
        } else {
            long a = P;
            long gcd = 1;
            for(long i = 2; (i*i) <= a; i++){
                long count = 0;
                while(P % i == 0){
                    count++;
                    P /= i;
                }
                if(count >= N){
                    gcd *= (long)Math.pow(i, count/N);
                }
            }
            System.out.println(gcd);
        }
   }
}