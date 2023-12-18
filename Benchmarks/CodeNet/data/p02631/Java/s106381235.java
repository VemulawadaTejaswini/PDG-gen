import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
        long[] answer = new long[n];
        for (int i=0; i<n; i++) {
            long ai=0;
            for (int j=0; j<n; j++) {
                if (i==j)
                    continue;
                ai = ai ^ a[j];
            }
            answer[i] = ai;
        }
        for (int i=0; i<n; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }
}