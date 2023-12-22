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
        int K = sc.nextInt();
        int[] P = new int[N];
        
        for(int i=0; i<N; i++){
            P[i] = sc.nextInt();
        }

        Arrays.sort(P);

        int min = 0;

        for(int i=0; i<K; i++){
            min += P[i];
        }

        System.out.println(min);
    } 
}