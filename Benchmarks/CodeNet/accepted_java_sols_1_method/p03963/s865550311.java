import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K;
        N = sc.nextInt();
        K = sc.nextInt();
        int num = K;
        for (int a = 1; a < N; a++) {
            num = num *(K - 1);
        }
        System.out.println(num);
    }
}
