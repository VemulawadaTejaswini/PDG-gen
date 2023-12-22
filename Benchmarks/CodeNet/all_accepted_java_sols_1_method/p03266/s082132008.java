import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();


        long count = 0;
        for (int a = 1; a < N + 1; a++) {
            int modA = (a % K);  // aの余り
            int modB = K - modA; // a + bはKで割り切れる必要があるので bの余りはK-(aの余り)
            int modC = K - modA; // a + cはKで割り切れる必要があるので cの余りはK-(aの余り)

            if ((modB + modC) % K == 0) { // b + cもKで割り切れる必要がある
                // N以下でKで割るとmodBになるBの個数 x N以下でKで割るとmodCになるCの個数
                long b = ((N + K - modB) / K);
                long c = ((N + K - modC) / K);
                long num = b * c;
                count += num;
            }
        }
        System.out.println(count);
    }
}
