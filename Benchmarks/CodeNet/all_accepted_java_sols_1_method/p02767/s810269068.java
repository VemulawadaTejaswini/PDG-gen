import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        long min = 10000000000L;
        for (int i = 1; i <= 100; i++) {
            long tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += (long)Math.pow(array[j] - i, 2);
            }
            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }
}
