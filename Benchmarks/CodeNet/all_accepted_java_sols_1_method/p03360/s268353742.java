import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static int[] map;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] s = new int[3];


        s[0] = scanner.nextInt();
        s[1] = scanner.nextInt();
        s[2] = scanner.nextInt();
        int k = scanner.nextInt();


        Arrays.sort(s);

        for (int i = 0; i < k; i++) {
            s[2] *= 2;
        }

        System.out.println(s[0] + s[1] + s[2]);



    }

}

