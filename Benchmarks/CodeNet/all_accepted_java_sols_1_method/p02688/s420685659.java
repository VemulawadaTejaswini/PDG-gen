import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < k; i++) {
            int l = sc.nextInt();
            for (int j = 0; j < l; j++) {
                int num = sc.nextInt()-1;
                array[num]++;
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) count++;
        }
        System.out.println(count);
    }
}
