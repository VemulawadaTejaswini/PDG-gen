import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        int array[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));

        long res = 0;

        for(int[] pair: array) {
            int a = pair[0];
            int b = pair[1];

            if ( b > M ) {
                res += (long)a * (long)M;
                break;
            } else {
                res += (long)a * (long)b;
                M -= b;
            }
        }

        System.out.println(res);

    }
}
