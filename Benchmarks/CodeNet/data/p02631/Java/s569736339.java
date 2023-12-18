import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] answer = new long[n];
        for (int i=0; i<n; i++) {
            long a = sc.nextLong();
            for (int j=0; j<n; j++) {
                if (i==j)
                    continue;
                answer[j] = answer[j] ^ a;
            }
        }
        for (int i=0; i<n; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }
}