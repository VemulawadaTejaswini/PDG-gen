import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int res = 0;
        for (int i=0; i<N; i++) {
            int h = sc.nextInt();
            if (h>=K) {
                res += 1;
            }
        }
        System.out.println(res);
    }
}