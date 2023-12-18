;

import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    static final int INF = 2147483647;
    static int n;
    static int[] D;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int l = scanner.nextInt();
        initRMQ(N);

        for(int i = 0; i < N; i++){
            int x = scanner.nextInt();
            update(i, x);
        }

        
        for(int i = 0; i <= N - l; i++){
            System.out.print(query(i, i + l, 0, 0, n));
            if(i < N - l) System.out.print(" ");
        }

        System.out.println();


    }

    public static String deleteColon(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(sb.lastIndexOf(" "));
        return sb.toString();
    }

    public static void initRMQ(int l){
        n = 1;

        while (n < l){
            n *= 2;
        }

        D = new int[2 * n - 1];

        for(int i = 0; i < 2 * n - 1; i++){
            D[i] = INF;
        }

    }

    public static void update(int k, int a){
        k += n - 1;
        D[k] = a;
        while (k > 0){
            k = (k - 1) / 2;
            D[k] = min(D[k * 2 + 1], D[k * 2 + 2]);
        }
    }

    public static int findMin(int a, int b){
        return query(a, b + 1, 0, 0, n);
    }

    public static int query(int a, int b, int k, int l, int r){

        if(r <= a || b <= l) return INF;

        if(a <= l && r <= b) return D[k];


        int vl = query(a, b, k * 2 + 1, l, (l + r) / 2 );
        int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
        return min(vl, vr);

    }
}

