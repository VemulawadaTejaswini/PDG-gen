import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }
            else{
                map.put(a[i], 1);
            }
        }
        long ans = 0L;
        for(int key : map.keySet()){
            if(key>map.get(key)){
                ans += map.get(key);
            }
            else if(key<map.get(key)){
                ans += map.get(key) - key;
            }
        }
        System.out.println(ans);
    }
}