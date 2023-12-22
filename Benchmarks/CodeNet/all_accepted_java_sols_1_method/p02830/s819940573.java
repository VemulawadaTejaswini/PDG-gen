import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        char[] ans = new char[2 * N];

        int pos = 0;
        for (int i = 0; i < N; i++) {
            ans[pos] = S[i];
            pos++;
            ans[pos] = T[i];
            pos++;
        }

        System.out.println(ans);
    }
}
