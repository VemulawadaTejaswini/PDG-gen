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

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int min = Y;
        int max = X;
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            max = Math.max(max, temp);
        }

        for (int i = 0; i < M; i++) {
            int temp = scanner.nextInt();
            min = Math.min(min, temp);
        }

        if(min <= max) {
            System.out.println("War");
        }else{
            System.out.println("No War");
        }

    }
}

