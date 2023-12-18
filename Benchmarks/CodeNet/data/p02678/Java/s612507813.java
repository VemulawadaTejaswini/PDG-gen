
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer>[] tree = new ArrayList[N];
        for(int i = 0; i < N; i++)
            tree[i] = new ArrayList();

        for(int i = 0; i < M; i++){
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            tree[A].add(B);
            tree[B].add(A);
        }

        HashSet<Integer> set = new HashSet();
        set.add(0);
        HashSet<Integer> visited = new HashSet<>();
        int ans[] = new int[N];

        while(!set.isEmpty()){
            HashSet<Integer> set2 = new HashSet();
            for(Integer num : set) {
                visited.add(num);
                for(Integer dest : tree[num]) {
                    if(!visited.contains(dest) && !set.contains(dest)) {
                        ans[dest] = num;
                        set2.add(dest);
                    }
                }
            }
            set = set2;
        }

        if(visited.size() != N){
            os.println("No");
            return;
        }

        os.println("Yes");
        for(int i = 1; i < N; i++) {
            os.println(ans[i]+1);
        }

    }
}