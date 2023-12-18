import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;
import java.awt.Point;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long ans = sc.nextLong();
        for(int i=1; i<N; i++) {
            long A = sc.nextLong();
            ans *= A;
            if(ans>1000000000000000000L || ans<0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    } 
}