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
        int T = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        int min = A[0];
        int B = 0;
        int ans = 0;
        for(int i=1; i<N; i++) {
            min = Math.min(min, A[i - 1]);
            if(B==A[i]-min) {
                ans++;
            }
            else{
                B = Math.max(B, A[i] - min);
                if(B==A[i]-min) {
                    ans = 1;
                }
            }
        }
        System.out.println(ans);
    } 
}