// PROXY

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long k = scan.nextLong();
        long a = scan.nextLong();  
        long b = scan.nextLong();
        long biscuit = 1;
        if(b - a < 3){
            for(int i = 1; i <= k; i++){
                biscuit += 1;
            }
        System.out.println(biscuit);
        } else {
            if((k % 2 == 1 && a % 2 == 1)||(k % 2 == 0 && a % 2 == 0)){
                for(long i = 1; i <= a; i++ ) biscuit += 1;
                for(long j = 1; j <= (k - a)/2; j++ ) biscuit +=(b-a);
                System.out.println(biscuit);
            } else if((k % 2 == 1 && a % 2 == 0)||(k % 2 == 0 && a % 2 == 1)){
                for(long i = 1; i <= a - 1; i++ ) biscuit += 1;
                for(long j = 1; j <= (k - a + 1)/2; j++) biscuit +=(b-a);
                System.out.println(biscuit);
            } 
        }
    }
}
