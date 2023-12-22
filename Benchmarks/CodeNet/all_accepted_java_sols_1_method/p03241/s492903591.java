import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int K;
    static int Q;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;
    static long ans = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextInt();

        long M = scanner.nextInt();

        long ans = 1;
        long nokori;

        for (long i = M; i >= 0; i--) {
            nokori = M - N * i;

            if (nokori >= 0 && nokori % i == 0){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}

