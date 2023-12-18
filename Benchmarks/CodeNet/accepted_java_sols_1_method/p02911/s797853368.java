import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());

        int[] point = new int[N];
        for (int i=0;i<N;i++) {
            point[i] = K-Q;
        }
        for (int i=0;i<Q;i++) {
            int A = Integer.parseInt(sc.next())-1;
            point[A]++;
        }
        for (int i=0;i<N;i++) {
            if (point[i]<=0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}