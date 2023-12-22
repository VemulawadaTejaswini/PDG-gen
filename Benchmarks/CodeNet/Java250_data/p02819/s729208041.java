import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int SIZE = 200000;
    static boolean[] isNotPrime = new boolean[SIZE];

    public static void main(String[] args) {
        sieve();
        int x = sc.nextInt();
        for(int i = x; i < SIZE; i += (i % 2 == 0) ? 1 : 2) {
            if(!isNotPrime[i]) {
                System.out.println(i);
                return;
            }
        }
    }

    static void sieve() {
        double ub = Math.sqrt(SIZE);

        for(int i = 0; i <= ub; ++i) {
            if(i < 2) {
                isNotPrime[i] = true;
            } else if(!isNotPrime[i]) {
                for(int j = i * i; j < SIZE; j += i) isNotPrime[j] = true;
            }
        }
    }
}