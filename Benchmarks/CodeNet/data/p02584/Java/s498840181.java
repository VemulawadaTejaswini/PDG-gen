import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        long minx = 0;

        if ((X / D) >= K) {
            minx = X - (D * K);
        } else {
            if (((X/D) - K) % 2 == 0) {
                minx = X % D;
            } else {
                minx = X % D - D;
            }
        }

        if (minx > -minx) {
            System.out.println(minx);
        } else {
            System.out.println(-minx);
        }
        
    }
}