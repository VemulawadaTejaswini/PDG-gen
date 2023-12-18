import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                long x = sc.nextLong();
                long k = sc.nextLong();
                long d = sc.nextLong();
                sc.close();
                if(x / d > k){
                        System.out.println(x - d * k);
                }else{
                        long yono = x / d;
                        k -= yono;
                        x = x % d;
                        if(k % 2 == 0){
                                System.out.println(x);
                        }else{
                                System.out.println(d - x);
                        }
                }
        }
}