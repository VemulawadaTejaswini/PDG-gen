import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        if(A+B>=K) {
            System.out.println(Math.min(K, A));
            return;
        }
        System.out.println(A-(K-(A+B)));
    }
}
