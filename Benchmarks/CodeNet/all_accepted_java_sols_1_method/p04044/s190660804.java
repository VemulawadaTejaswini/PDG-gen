import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String S[] = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        Arrays.sort(S);
        String ans = String.join("", S);
        System.out.println(ans);
    }
}