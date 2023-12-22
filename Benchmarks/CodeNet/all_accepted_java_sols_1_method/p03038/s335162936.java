//https://atcoder.jp/contests/abc127/tasks/abc127_d

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i=0;i<N;i++){
            A.add(sc.nextInt());
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> keys = new ArrayList<>();
        for (int i=0;i<M;i++){
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (map.containsKey(C)){
                map.put(C,map.get(C)+B);
            } else {
                map.put(C,B);
                keys.add(C);
            }
        }
        Collections.sort(keys,Collections.reverseOrder());
        Collections.sort(A);
        int now = 0;
        for (int key:keys){
            int b = 0;
            for (int i=now;i<N;i++){
                now = i;
                if (A.get(i)<key){
                    A.set(i,key);
                    b++;
                }
                if (b>=map.get(key)){
                    break;
                }
            }
        }
        long ans = 0;
        for (int a:A){
            ans+=a;
        }
        System.out.println(ans);
    }
}