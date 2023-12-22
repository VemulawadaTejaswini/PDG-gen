import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        int mi = N+1;

        for(int i = 0; i < N; i++) {
            int P = sc.nextInt();
            mi = Math.min(mi, P);
            if(mi == P) {
                res++;
            }
        }
        System.out.println(res);
    }
}
