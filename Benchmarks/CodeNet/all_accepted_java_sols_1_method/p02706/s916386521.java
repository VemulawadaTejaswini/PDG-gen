import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += sc.nextInt();
        }
        int result = N - sum;
        if (result < 0) {
            result = -1;
        }
        System.out.println(result);
        sc.close();
    }
}