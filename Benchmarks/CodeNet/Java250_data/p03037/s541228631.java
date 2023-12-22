//https://atcoder.jp/contests/abc127/tasks/abc127_c

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int high = 100_000;
        int low = 0;
        for (int i=0;i<M;i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            if (L>low){
                low = L;
            }
            if (R<high){
                high = R;
            }
        }
        sc.close();
        if (high>=low){
            System.out.println(high-low+1);
        } else {
            System.out.println(0);
        }
    }
}