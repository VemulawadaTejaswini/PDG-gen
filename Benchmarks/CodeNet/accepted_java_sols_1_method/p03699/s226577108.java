import java.util.*;

public class Main {
    static int INF = 1001001009;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        int minnotzero = INF;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 10 != 0) {
                minnotzero = Math.min(minnotzero, array[i]);
            }
            sum += array[i];
        }
        
        if (minnotzero == INF) {
            System.out.println(0);
        } else {
            if (sum % 10 == 0) sum -= minnotzero;
            System.out.println(sum);
        }
    }
}
