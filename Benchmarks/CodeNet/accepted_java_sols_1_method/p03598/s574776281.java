import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        long ans = 0;
        for(int i = 0; i<N; i++) {
            x[i] = sc.nextInt();
            ans += Math.min(Math.abs(x[i]-0), Math.abs(x[i] -K));
        }
        System.out.println(ans*2);



    }
}