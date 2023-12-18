
import java.util.*;

class Main {
    public static void main(String[] args) {
       
       Scanner scner = new Scanner(System.in);

        int n = scner.nextInt();
        int[] S = new int[n];
        for (int i=0; i<n; i++) {
            S[i] = scner.nextInt();
        }

        int q = scner.nextInt();
        int[] T = new int[q];
        for (int i=0; i<q; i++) {
            T[i] = scner.nextInt();
        }
        int num = seSearch(q, n, S, T);
        System.out.println(num);
       }

    public static int seSearch(int c, int d, int[] a, int[] b) {
     int solve = 0;
     for (int i=0; i<c; i++){
        for (int j=0; j<d; j++){
        if (a[j] == b[i]){
            solve++;
            break;
        }
        }
    }

    return solve;

    }

}
