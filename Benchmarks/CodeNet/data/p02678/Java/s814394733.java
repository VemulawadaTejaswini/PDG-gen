import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> G = new ArrayList<>();
        for(int i = 0; i < m; i++) G.add(new ArrayList<>());
        for(int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            G.get(a).add(b);
            G.get(b).add(a);
        }

        int[] res = new int[n];
        Arrays.fill(res, -1);
        Queue<Integer> que = new ArrayDeque<>();

        res[0] = 0;
        que.offer(0);
        while(!que.isEmpty()) {
            int v = que.poll();

            for(int nv : G.get(v)) {
                if(res[nv] != -1) continue;
                res[nv] = v + 1;
                que.offer(nv);
            }
        }

        System.out.println("Yes");
        for(int i = 1; i < res.length; i++) {
            sb.append(res[i] + "\n");
        }
        System.out.print(sb);
    }
}
