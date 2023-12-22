import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        long countA = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (i % 2 == 0) {
                if (sum <= 0) {
                    countA += sum * (-1) + 1;
                    sum = 1;
                }
            } else {
                if (sum >= 0) {
                    countA += sum + 1;
                    sum = -1;
                }
            }
        }
        
        long countB = 0;
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (i % 2 == 1) {
                if (sum <= 0) {
                    countB += sum * (-1) + 1;
                    sum = 1;
                }
            } else {
                if (sum >= 0) {
                    countB += sum + 1;
                    sum = -1;
                }
            }
        }
        
        System.out.println(Math.min(countA, countB));
    }
}
