import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T = sc.nextInt();
        long A = sc.nextInt();
        for (int i=0;i<N-1;i++) {
            long t = sc.nextInt();
            long a = sc.nextInt();
            long tmp = Math.max((T+t-1)/t, (A+a-1)/a);
            T = t*tmp;
            A = a*tmp;
        }
        System.out.println(T+A);
    }
}