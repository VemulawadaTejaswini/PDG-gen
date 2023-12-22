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
        Arrays.sort(array);
        
        long sum = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += array[i];
            count++;
            if (count == n) break;
            sum += array[i];
            count++;
            if (count == n) break;
        }
        System.out.println(sum - array[n-1]);
    }
}