import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int ans = 1;
        for (int i = 0; i < N - 1; i++) {
            if (S[i] != S[i + 1]) ans++;
        }
        System.out.println(ans);
    }

}
