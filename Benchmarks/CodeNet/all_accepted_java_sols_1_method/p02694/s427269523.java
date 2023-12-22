import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        long k = inp.nextLong();
        long s = 100;
        long c = 0;
        while (true) {
            c++;
            s = ( long ) ( ( ( double )s ) * 1.01);
            if (s >= k) {
                System.out.println(c);
                break;
            }
        }
    }
}