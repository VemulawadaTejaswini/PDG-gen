import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long x;
        if(N<B){
            x = N;
        }
        else{
            x = B - 1;
        }
        long ans = A * x / B - A * (x / B);

        System.out.println(ans);
    }
}