import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[K];
        for(int i = 0; i < N; i++){
            a[i % K] += 1;
        }
        int bun = a[0] - a[K -1];
        System.out.println(bun);
    }
}
