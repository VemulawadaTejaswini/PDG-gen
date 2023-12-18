import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            if (array[i] <= min) {
                ans++;
                min = array[i];
            }
        }

        System.out.println(ans);

    }

}