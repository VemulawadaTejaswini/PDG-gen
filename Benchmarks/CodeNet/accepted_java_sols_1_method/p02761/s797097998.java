import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        Arrays.fill(array, -1);
        
        while (m-- > 0) {
            int digit = sc.nextInt() - 1;
            int num = sc.nextInt();
            
            if (digit == 0 && num == 0) {
                if (n != 1) {
                System.out.println(-1);
                return;
                } else {
                    array[digit] = -1;
                    continue;
                    
                }
            }
            
            if (array[digit] == -1 || array[digit] == num) {
                array[digit] = num;
            } else {
                System.out.println(-1);
                return;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (n == 1 && array[0] == -1) {
                System.out.println(0);
                return;
            }
            if (array[i] == -1) {
                array[i] = 0;
            }
            if (i == 0 && array[i] == 0) array[i]++;
            System.out.print(array[i]);
        }
        System.out.println();
        
    }
}
