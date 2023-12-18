import java.util.*;

public class Main{
        public static void main(String args[]){
                try(Scanner sc = new Scanner(System.in)){
                        long p = sc.nextLong(), q = sc.nextLong();
                        long memo = q/gcd(p,q);
                        long ans = -1;
                        long i = 1;

                        while(ans!=memo){
                                ans = memo;
                                while(i*i < memo){
                                        i++;
                                }
                                if(i*i==memo){
                                        memo = i;
                                }
                        }
                        System.out.println(ans);
                }
        }
        private static long gcd(long p, long q){
                if(p < q) {
                        return gcd(q, p);
                }
                if(q==0){
                        return p;
                }
                return gcd(q, p%q);
        }
}