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
        
        int now = array[0];
        int max = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] <= now) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
            now = array[i];
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
}
