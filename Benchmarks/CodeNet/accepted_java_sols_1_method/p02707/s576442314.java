

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> adj[] = new List[n+1];
        for(int i=0; i<=n; i++) {
            adj[i] = new ArrayList();
        }
        for(int i=1; i<n; i++) {
            int boss = sc.nextInt();
            adj[boss].add(i);
        }

        for(int i=1; i<=n; i++) {
            System.out.println(adj[i].size());
        }
    }
}

