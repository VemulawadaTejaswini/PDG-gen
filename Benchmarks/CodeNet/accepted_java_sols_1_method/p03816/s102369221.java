import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int ba = -1;
        int cnt = 0;
        for (int a : A) {
            if(ba == a){
                cnt++;
            } else {
                ba = a;
            }
        }

        cnt = (int)Math.ceil(cnt / 2.0) * 2;
        out.println(N - cnt);
    }
}