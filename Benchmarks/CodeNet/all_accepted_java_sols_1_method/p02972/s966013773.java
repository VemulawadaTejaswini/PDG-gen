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
        
        int count = 0;
        int[] tmp = new int[n];
        for (int i = n; i >= 1; i--) {
            int sum = 0;
            for (int j = i * 2; j <= n; j += i) {
                sum += tmp[j - 1];
            }
            
            if (array[i - 1] == 0) {
                if (sum % 2 == 1) {
                    tmp[i - 1]++;
                    count++;
                }
            } else {
                if (sum % 2 == 0) {
                    tmp[i - 1]++;
                    count++;
                }
            }
        }
        
        System.out.println(count);
        if (count == 0) return;
        for (int i = 0; i < n; i++) {
            if (tmp[i] % 2 == 0) continue; 
            System.out.print(i+1);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
