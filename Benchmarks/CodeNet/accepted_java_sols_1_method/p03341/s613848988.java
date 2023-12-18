import java.util.*;

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
        N = scanner.nextInt();
        String s = scanner.next();

        int a = 0;
        int b = 0;

        int c = 0;

        for (int i = 0; i < N; i++) {
            if(s.charAt(i) == 'W'){
                a++;
            }
        }
        b = N - a;
        c = b;

        int min = 99999999;
        for (int i = 0; i < N; i++) {
            if(s.charAt(i) == 'E'){
                c--;
            }
            min = Math.min(min, c);

            if(s.charAt(i) == 'W'){
                c++;
            }

        }

        System.out.println(min);

    }



}

