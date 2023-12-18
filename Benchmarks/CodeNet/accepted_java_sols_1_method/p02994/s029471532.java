import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = k + i;
            sum += array[i];
        }
        
        if (array[0] > 0) {
            sum -= array[0];
        } else if (array[n - 1] < 0) {
            sum -= array[n - 1];
        }
        
        System.out.println(sum);
        // System.out.println(Arrays.toString(array));
    }
}
