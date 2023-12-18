import java.util.*;
public class Main {
	public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }
 
    int N; // 2 <= N <= 200000
    int M; // 0 <= M <= 200000
    int[] A;
    int[] B;
    Set<Integer>[] groups;
    int result;
 
    private void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[M];
        B = new int[M];
        groups = new Set[N];
        for (int i=0; i<M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            Set<Integer> s = new HashSet<>();
            s.add(i+1);
            groups[i] = s;
        }
        result = 1;
    }
 
    private void solve() {
        for (int i=0; i<M; i++) {
            // debug();
            Set<Integer> groupA = groups[A[i]-1];
            Set<Integer> groupB = groups[B[i]-1];
            if (groupA.equals(groupB)) {
                continue;
            }
            Set<Integer> groupAandB = merge(groupA, groupB);
            if (groupAandB.size() > result) {
                result = groupAandB.size();
                if (result == N) {
                    return;
                }
            }
            groupA = groupAandB;
            groupB = groupAandB;
        }
    }
 
    private Set<Integer> merge(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> result = new HashSet<>();
        result.addAll(s1);
        result.addAll(s2);
        return result;
    }
 
    private void output() {
        System.out.println(result);
    }
    
    private void debug() {
        System.out.println("result=" + result);
        for (Set<Integer> g : groups) {
            System.out.println("group_start");
            for (Integer i : g) {
                System.out.println(i);
            }
            System.out.println("group_end");
        }
    }
 
}