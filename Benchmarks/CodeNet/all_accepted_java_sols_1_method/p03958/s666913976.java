import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        
        int ans = Math.max(0, array[k - 1] - (n - array[k - 1] + 1));
        
        System.out.println(ans);
    }
}
