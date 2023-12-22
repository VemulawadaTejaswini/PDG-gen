import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int A;
    static int B;
    static int C;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        A = scanner.nextInt();

        int[] map = new int[A];
        int[] map2 = new int[A];

        for (int i = 0; i < A; i++) {
            map[i] = scanner.nextInt();
            map2[i] = map[i];
        }

        Arrays.sort(map);

        B  = map[A / 2 - 1];
        C = map[A / 2];

        for (int i = 0; i < A; i++) {
            if((B + C) / 2 < map2[i]) System.out.println(B);
            else System.out.println(C);
        }





    }





}

