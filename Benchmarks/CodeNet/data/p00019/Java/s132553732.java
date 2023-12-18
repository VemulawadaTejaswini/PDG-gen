
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long n = 0;

        for (long z = a - 1; z != 0; z--) {
            n = a * z;
            a = n;
        }
        System.out.println(n);
    }
}

