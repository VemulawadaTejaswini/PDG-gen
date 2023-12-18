import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int M;
    static int A;
    static long B;
    static long C;
//    static int[][] map;
    static int min = 9999999;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        int ok = 0;
        for (int i = 0; i <= N; i++) {
            if(i % 4 != 0)continue;
            if(((N - i) % 7) != 0)continue;
            ok = 1;
        }

        if(ok == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }




}

