import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, q;
        int[] T, S;
        int i, j, count = 0;
        n = cin.nextInt();
        T = new int[n + 1];
        for (i = 0; i < n; i++)
            T[i] = cin.nextInt();
        q = cin.nextInt();
        S = new int[q + 1];
        for (i = 0; i < q; i++)
            S[i] = cin.nextInt();
        for (i = 0; i < q; i++) {
            T[n] = S[i];
            for (j = 0; T[j] != S[i]; j++);
            if (j != n)
                count++;
        }
        System.out.println(count);
    }
}
