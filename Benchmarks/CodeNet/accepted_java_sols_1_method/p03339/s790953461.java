import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        sc.close();

        int [] member = new int [N];
        int [] w = new int [N];
        int [] e = new int [N];

        for (int i = 0; i < N; i++) {
            int w_sum = 0;
            int e_sum = 0;
            if (S.charAt(i) == 'E') {
                e_sum++;
            } else {
                w_sum++;
            }
            if (i < 1) {
                e[i] = e_sum;
                w[i] = w_sum;
            }else{
                e[i] = e_sum + e[i-1];
                w[i] = w_sum + w[i-1];
            }
        }

        for (int i = 0; i < N; i++) {
            if (i < 1) {
                member[i] = e[N-1] - e[i];
            } else if ( i == N - 1) {
                member[i] = w[i];
            } else {
                member[i] = w[i-1] + (e[N-1] - e[i]);
            }
        }

        int ans = member[0];
        for (int i = 1; i < N; i++) {
            int result = member[i];
            ans = Math.min(ans, result);
        }

        System.out.println(ans);
    }
}