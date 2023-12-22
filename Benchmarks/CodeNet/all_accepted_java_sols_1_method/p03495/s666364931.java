import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int kazu[] = new int[n];
        for (int i = 0; i < n; i++) {
            kazu[sc.nextInt() - 1] += 1;
        }
        Arrays.sort(kazu);

        int sum = 0;
        for (int i = 0; i < n - k; i++) {
            sum += kazu[i];
        }
        System.out.println(sum);
    }
}