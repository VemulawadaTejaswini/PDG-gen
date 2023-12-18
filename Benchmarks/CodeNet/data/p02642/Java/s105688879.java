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

        System.out.println(solve2(N, A));
    }

    private static int solve(int N, int[] A) {
        Arrays.sort(A);
        List<Integer> ans = new ArrayList();
        int dup = 0;

        check: for (int i=0; i<N; i++) {
            if (i > 0 && A[i] == A[i-1]) continue;
            if (i < N-1 && A[i] == A[i+1]) {
                dup++;
                ans.add(A[i]);
                continue;
            }

            for (int j=0; j<ans.size(); j++) {
                int val = ans.get(j);

                if (A[i]%val == 0) {
                    continue check;
                } else if (val > A[i]/2) {
                    break;
                }
            }

            ans.add(A[i]);
        }

        return ans.size() - dup;
    }

    private static int solve2(int N, int[] A) {
        int[] count = new int[1_000_001];
        
        for(int i = 0; i < N; i++){
            count[A[i]]++;
        }

        if (count[1] > 1) {
            return 0;
        } else if (count[1] == 1) {
            return 1;
        }

        int ans = 0;
        Arrays.sort(A);
        boolean[] visited = new boolean[1_000_001];
        for(int i = 0; i < N; i++){
            if(count[A[i]] == 1 && !visited[A[i]]) ans++;
            for(int j = A[i] + A[i]; j <= visited.length; j += A[i]){
                visited[j] = true;
            }
        }

        return ans;
    }
}
