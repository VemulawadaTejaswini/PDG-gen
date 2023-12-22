import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        boolean[] lose = new boolean[K+1];
        for(int k = 0; k < a[0]; k++) {
            lose[k] = true;
        }
        for(int k = a[0]; k < K+1; k++) {
            for(int i = 0; i < N; i++) {
                int next = k - a[i];
                if(next >= 0) {
                    if (lose[next]) {
                        lose[k] = false;
                        break;
                    }
                }
                lose[k] = true;
            }
        }
        if(lose[K]) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}