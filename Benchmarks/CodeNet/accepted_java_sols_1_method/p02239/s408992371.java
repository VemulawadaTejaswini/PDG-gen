import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<PriorityQueue<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            PriorityQueue<Integer> set = new PriorityQueue<>();
            list.add(set);
        }

        for(int i = 0; i < n; i++) {
            int u = sc.nextInt() - 1;
            int k = sc.nextInt();
            for(int j = 0; j < k; j++) {
                list.get(u).add(sc.nextInt() - 1);
            }
        }

        int[] dist = new int[n];
        for(int i = 0; i < n; i++) {
            dist[i] = -1;
        }

        Queue<Integer> task = new ArrayDeque<>();
        task.add(0);
        dist[0] = 0;
        while(!task.isEmpty()) {
            int i = task.poll();
            while(!list.get(i).isEmpty()) {
                int j = list.get(i).poll();
                if(dist[j] < 0) {
                    dist[j] = dist[i] + 1;
                    task.add(j);
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("%d %d\n", i + 1, dist[i]);
        }

        sc.close();
    }
}

