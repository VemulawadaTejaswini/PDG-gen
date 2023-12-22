import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array = new int[n];
        int sum = 0;

        int count = 0;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        double limit = ((double) sum) / (4 * m);

        for (int i = 0; i < n; i++) {
            if (array[i] >= limit) {
                count++;
            }
        }

        System.out.println(count >= m ? "Yes" : "No");
    }
}