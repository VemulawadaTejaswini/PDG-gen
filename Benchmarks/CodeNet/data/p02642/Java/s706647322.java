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
        int dup = 0;

        check: for (int i=0; i<N; i++) {
            if (i > 0 && A[i] == A[i-1]) continue;
            if (i < N-1 && A[i] == A[i+1]) {
                dup++;
                ans.add(A[i]);
                continue;
            }
            
            for (int j=0; j<ans.size(); j++) {
                int val = ans.get(i);

                if (A[i]%val == 0) {
                    continue check;
                } else if (val > A[i]/2) {
                    break;
                }
            }

            ans.add(A[i]);
        }

        return ans.size();
    }
}