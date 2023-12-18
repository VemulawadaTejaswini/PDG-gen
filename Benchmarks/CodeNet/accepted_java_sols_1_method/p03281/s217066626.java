import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static long N;
    static int M;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        int ret = 0;
        for (int i = 0; i <= N; i++) {
            int ans = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0)ans++;
            }
            if(ans == 8 && i % 2 == 1)ret++;
        }


        System.out.println(ret);

    }
}

