import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        int n = scanner.nextInt();
        int[] set1 = new int[n];
        for (int i = 0; i < n; i++) {
            set1[i] = scanner.nextInt();
        }
        
        int q = scanner.nextInt();
        int[] set2 = new int[q];  
        for (int i = 0; i < q; i++) {
            set2[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < q; i++) {
            int target = set2[i];
            for (int j = 0; j < n; j++) {
                if ( target == set1[j]) {
                    result++;
                    break;
                }
            }
        }

     
        System.out.println(result);
    }
}