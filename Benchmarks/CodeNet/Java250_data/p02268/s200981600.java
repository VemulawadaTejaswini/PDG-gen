import java.util.Scanner;

public class Main{
    public static int binarySearch(int start, int n, int[] S, int q) {
        int mid = (start + n) / 2;
        if(mid == start || mid == n)return -1;
        if (S[n] < q || S[start] > q)
        return -1;
        if (S[start] == q){
            return 1;
        }
        if(S[mid] == q ){
            return 1;
        }
        if(S[n] == q) {
            return 1;
        }
        if (S[mid] < q) {
            return binarySearch(mid, n, S, q);
        } else {
            return binarySearch(start, mid, S, q);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, q;
        int S[];
        int T[];
        n = scan.nextInt();
        S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = scan.nextInt();
        }
        q = scan.nextInt();
        T = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < q; i++) {
            for (int j = i+1; j < q; j++) {
                if(T[i] == T[j])T[j]=-1;
            }
        }

        int ans = 0;

        for (int i = 0; i < q; i++) { 
            if (binarySearch(0, n-1, S, T[i]) == 1)ans++;
        }

        System.out.println(ans);
    }
}
