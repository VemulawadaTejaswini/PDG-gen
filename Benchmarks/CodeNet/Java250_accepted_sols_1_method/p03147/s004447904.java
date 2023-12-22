//https://atcoder.jp/contests/abc116/tasks/abc116_c

import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for (int i=0;i<N;i++){
            h[i] = sc.nextInt();
        }
        sc.close();
        int area = 0;
        int ans = 0;
        for (int i=0;i<N;i++){
            if (h[i]==0){
                ans += area;
                area = 0;
            }
            if (h[i]>= area){
                area = h[i];
            } else {
                ans += area - h[i];
                area = h[i];
            }
        }
        ans += area;
        System.out.println(ans);
    }
}