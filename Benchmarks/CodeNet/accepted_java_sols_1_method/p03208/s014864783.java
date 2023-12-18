//https://atcoder.jp/contests/abc115/tasks/abc115_c

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> h = new ArrayList<>();
        for (int i=0;i<N;i++){
            h.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(h);
        int dif = Integer.MAX_VALUE;
        for (int i=0;i<N-K+1;i++){
            if (h.get(i+K-1)-h.get(i)<dif){
                dif = h.get(i+K-1)-h.get(i);
            }
        }
        System.out.println(dif);
    }
}