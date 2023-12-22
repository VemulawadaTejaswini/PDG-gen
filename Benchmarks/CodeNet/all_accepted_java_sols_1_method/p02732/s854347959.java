import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] count = new int[N+1];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            count[A[i]]++;
        }

        long sum = 0;
        for (int i = 1; i <= N; i++) {
            if (count[i] >= 2) {
                sum += (long)count[i]*(count[i]-1)/2;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            long tmp = count[A[i]] == 2 ? sum-1 : sum-(count[A[i]]-1);
            ans.append(tmp).append('\n');
        }

        System.out.print(ans);
    }
}

