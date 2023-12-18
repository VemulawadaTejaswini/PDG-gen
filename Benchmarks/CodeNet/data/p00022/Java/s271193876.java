import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            
            int[] input = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                input[i] = scanner.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += input[j];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println(max);
        }
    }
}