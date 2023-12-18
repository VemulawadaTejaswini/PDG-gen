

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    static final int INF = 2147483647;
    static final int LAZYRANGE = 16;
    static int[] D;
    static int[] lazy;
    static int a_n;
    static int t_n;
    static int c = 0;


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        a_n = Integer.parseInt(scanner.next());
        int q = Integer.parseInt(scanner.next());

       initRUQ(a_n);



        for(int i = 0; i < q; i++){
            int com = Integer.parseInt(scanner.next());

            if(com == 0){
                int s = Integer.parseInt(scanner.next());
                int t = Integer.parseInt(scanner.next());
                int x = Integer.parseInt(scanner.next());

                update(s, t, x);


            }

            if(com == 1){
                int k = Integer.parseInt(scanner.next());
                System.out.println(find(k));
            }


        }


    }

    public static void initRUQ(int a_n){

        D = new int[a_n];
        lazy = new int[a_n / LAZYRANGE + 1];

        for (int i = 0; i < a_n; i++){
            D[i] = INF;
        }

        for(int i = 0; i < lazy.length; i++){
            lazy[i] = INF;
        }

    }

    public static void update(int s, int t, int x){

        while (s <= t){

            if(s == 0 || s % LAZYRANGE != 0){
                if(lazy[s / LAZYRANGE] != INF){
                    propagate(s);
                }
                D[s] = x;
                s++;
            }else if(s % LAZYRANGE == 0){
                if(s + LAZYRANGE <= t){
                    lazy[s / LAZYRANGE] = x;
                    s += LAZYRANGE;
                }else {
                    if(lazy[s / LAZYRANGE] != INF){
                        propagate(s);
                    }
                    D[s] = x;
                    s++;
                }
            }
        }




    }

    public static int find(int k){
        if(lazy[k / LAZYRANGE] != INF){
            propagate(k);
        }
        return D[k];
    }

    public static void propagate(int k){
        for(int i = 0; i < LAZYRANGE; i++){
            D[k / LAZYRANGE * LAZYRANGE + i] = lazy[k / LAZYRANGE];
        }
        lazy[k / LAZYRANGE] = INF;
    }

    public static int query(int a, int b, int k, int l, int r){
        if(r <= a || b <= l) return INF;
        if(a <= l && r <= b) return D[k];


        int vl = query(a, b, k * 2 + 1, l, (l + r) / 2 );
        int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
        return min(vl, vr);

    }

    public static int findMin(int a, int b){
        return query(a, b + 1, 0, 0, t_n);
    }
}
