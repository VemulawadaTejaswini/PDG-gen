import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer array[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0)  continue;

            ans += array[i/2];

        }

        System.out.println(ans);

        sc.close();

    }

}