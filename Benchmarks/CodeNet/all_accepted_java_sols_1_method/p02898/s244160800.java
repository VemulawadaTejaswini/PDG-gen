import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int ct = 0;
        for(int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if(tmp >= K) {
                ct += 1;
            }
        }

        System.out.println(ct);
    }
}
