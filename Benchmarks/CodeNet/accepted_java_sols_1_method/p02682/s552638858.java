import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        long ans = 0;
        if(A>=K){
            ans += K;
        }
        else{
            ans += A;
            K -= A;
            if(K>B){
                K -= B;
                ans -= K;
            }
        }
        System.out.println(ans);
    }
}