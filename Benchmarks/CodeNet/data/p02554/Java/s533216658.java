import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long mod = (long)1e9 + 7;

        long n = sc.nextLong();

        long total = 1;
        for (int i=0; i<n; i++) {
            total *= 10;
            total %= mod;
        }
        total += mod;

        long none = 1;
        for (int i=0; i<n; i++) {
            none *= 8;
            none %= mod;
        }

        long nine = 1;
        for (int i=0; i<n; i++) {
            nine *= 9;
            nine %= mod;
        }
        long eight = 1;
        for (int i=0; i<n; i++) {
            eight *= 8;
            eight %= mod;
        }

//        System.out.println(total);
//        System.out.println(none);
//        System.out.println(nine);
//        System.out.println(eight);

        total -= (none + (nine - eight) * 2);
        total += mod;

        System.out.print(total % mod);

    }


}

