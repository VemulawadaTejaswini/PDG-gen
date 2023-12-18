import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] * 4 * m >= sum) count++;
        }
        
        if (count >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
