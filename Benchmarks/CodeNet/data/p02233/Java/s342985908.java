
import java.util.*;

/**
 * A
 */
public class Main {

    void run() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        System.out.println(fib(n));

    }

    int fib(int n) {

        /*
        if(n==0 || n==1) {
            return 1;
        }
        */

        int a = 1;
        int b = 1;
        int tmp = 1;;

        for(int i=1; i<n; i++) {

            tmp = a+b;
            a = b;
            b = tmp;

        }

        return tmp;

    }

    public static void main(String[] args) {
        new Main().run();
    }
}
