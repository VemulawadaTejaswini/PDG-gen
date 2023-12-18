import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n+1];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] T = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < q; i++) {
            int t = T[i];
            if(LinearSearch(S,n,t)){
                ans++;
            }
        }

        System.out.println(ans);

    }

    static Boolean LinearSearch(int[] S, int n, int t){
        S[n] = t;
        int i = 0;
        while (S[i] != t){
            i++;
        }
        return i != n;
    }
}

