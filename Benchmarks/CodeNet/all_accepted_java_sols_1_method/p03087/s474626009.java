import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        int[] cumSum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            if (i != n - 1 && s.charAt(i) == 'A' && s.charAt(i+1) == 'C') cumSum[i + 1] = cumSum[i] + 1;
            else cumSum[i + 1] = cumSum[i];
        }


        for (int i = 0; i < q; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(cumSum[b - 1] - cumSum[a - 1]);
        }
    }
}