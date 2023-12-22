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
        
        for (int i = n; i < 100000; i++) {
            boolean ok = true;
            
            String str = String.valueOf(i);
            for (int j = 0; j < k; j++) {
                if (str.contains(String.valueOf(array[j]))) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) {
                System.out.println(i);
                return;
            }
        }
    }
}