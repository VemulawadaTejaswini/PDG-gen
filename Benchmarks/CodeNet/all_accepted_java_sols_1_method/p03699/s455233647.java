import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        Arrays.sort(array);
        
        if (sum % 10 != 0) {
            System.out.println(sum);
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (array[i] % 10 != 0) {
                System.out.println(sum - array[i]);
                return;
            }
        }
        System.out.println(0);
        return;
    }
}
