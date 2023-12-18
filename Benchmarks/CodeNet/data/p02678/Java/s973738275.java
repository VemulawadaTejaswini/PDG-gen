import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            edge.add(add);
        }
        for (int i=0;i<M;i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            edge.get(A).add(B);
            edge.get(B).add(A);
        }

        int[] nums = new int[N];
        boolean[] visited = new boolean[N];
        ArrayDeque<int[]> q = new ArrayDeque<int[]>();
        int[] first = {0, -1};
        q.add(first);
        while (!q.isEmpty()) {
            int[] rem = q.poll();
            if (visited[rem[0]]) continue;
            visited[rem[0]] = true;
            nums[rem[0]] = rem[1];

            for (int i : edge.get(rem[0])) {
                if (!visited[i]) {
                    int[] add = {i, rem[0]};
                    q.add(add);
                }
            }
        }
        System.out.println("Yes");
        for (int i=1;i<N;i++) {
            System.out.println(nums[i]+1);
        }
    }
}