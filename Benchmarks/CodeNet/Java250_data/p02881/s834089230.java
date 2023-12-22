import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        sc.close();

        long a = 0L;
        long b = 0L;

        for (long i=(long)Math.sqrt(N); i>0; i--) {
            if (N % i==0) {
                a = i;
                b = N / i;
                break;
            }
        }

        System.out.println(a+b-2);
    }
}