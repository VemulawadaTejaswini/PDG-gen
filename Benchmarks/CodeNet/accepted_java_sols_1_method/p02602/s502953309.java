import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n - k; i++) {
            boolean ok = false;
            
            if (array[i] < array[i+k]) {
                ok = true;
            }
            
            if (ok) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
