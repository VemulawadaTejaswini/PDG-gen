

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    static final int INF = 2147483647;
    static int[] D;
    static int a_n;
    static int t_n;


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        a_n = Integer.parseInt(scanner.next());
        int q = Integer.parseInt(scanner.next());

        initRMQ(a_n);



        for(int i = 0; i < q; i++){
            int com = Integer.parseInt(scanner.next());
            int x = Integer.parseInt(scanner.next());
            int y = Integer.parseInt(scanner.next());



            if(com == 0){
                update(x, y);
            }
            if(com == 1){
                int result = findMin(x, y);
                System.out.println(result);
            }


        }


    }

    public static void initRMQ(int a_n){
        t_n = 1;

        while (t_n < a_n){
            t_n *= 2;
        }

        D = new int[2 * t_n - 1];

        for(int i = 0; i < 2 * t_n - 1; i++){
           D[i] = INF;
        }

    }

    public static void update(int k, int a){
        k += t_n - 1;
        D[k] = a;
        while (k > 0){
            k = (k - 1) / 2;
            D[k] = min(D[k * 2 + 1], D[k * 2 + 2]);
        }
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
