import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ans = new int[N];
        for (int i = 2; i <= N; i++) {
            ans[sc.nextInt()-1]++;
        }

        StringBuilder a = new StringBuilder();
        for (int i = 0; i < N; i++) {
            a.append(ans[i]).append('\n');
        }

        System.out.print(a);
    }
}
