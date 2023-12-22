import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        int[] cumS = new int[N];
        cumS[0] = 0;
        for (int i = 1; i < N; i += 1) {
            char prevS = S.charAt(i - 1);
            char curS = S.charAt(i);
            if (prevS == 'A' && curS == 'C') {
                cumS[i] = cumS[i - 1] + 1;
            } else {
                cumS[i] = cumS[i - 1];
            }
        }

        int lq, rq, ansq;
        for (int q = 0; q < Q; q += 1) {
            lq = Integer.parseInt(sc.next());
            rq = Integer.parseInt(sc.next());
            ansq = cumS[rq - 1] - cumS[lq - 1];
            System.out.println(ansq);
        }
    }

}
