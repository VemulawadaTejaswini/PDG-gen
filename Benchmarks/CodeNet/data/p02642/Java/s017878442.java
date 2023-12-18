import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, A));
    }

    private static int solve(int N, int[] A) {
        Arrays.sort(A);
        List<Integer> ans = new ArrayList();
        if (A[0] == A[N-1]) return 0;

        check: for (int i=0; i<N; i++) {
            for (int j=0; j<ans.size(); j++) {
                if (A[i]%ans.get(j) == 0) {
                    continue check;
                }
            }

            ans.add(A[i]);
        }

        return ans.size();
    }
}