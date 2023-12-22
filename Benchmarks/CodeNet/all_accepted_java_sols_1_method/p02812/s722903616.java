import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        int cnt = 0;
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (S[i] == 'A') {
                j=1;
            } else if (j == 1 && S[i] == 'B') {
                j+=1;
            } else if (j == 2 && S[i] == 'C') {
                cnt+=1;
                j=0;
            } else {
                j = 0;
            }
        }

        System.out.println(cnt);

    }
}
