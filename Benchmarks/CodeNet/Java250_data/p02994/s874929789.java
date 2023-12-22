import java.util.*;
//import java.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int aji[] = new int[N+1];
        int pi_aji = 0;
        int i;
        int min = 1000;
        int min_num = 1000;

        for (i = 1 ; i < N+1 ; i++) {
            aji[i] = L+i-1;
            if (Math.abs(min) > Math.abs(aji[i])) {
                min = aji[i];
                min_num = i;
            }
        }
        // System.out.println("min: "+ min);
        // System.out.println("min_num: "+ min_num);
        for (i = 1 ; i < N+1 ; i++) {
            if (i != min_num) {
                pi_aji += aji[i];
            }
        }
        System.out.println(pi_aji);
    }
}
