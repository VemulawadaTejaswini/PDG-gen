import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] post = new int[N+1];
        for(int i = 0; i <= N; i++) post[i] = -1;
        List<List<Integer>> room = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            List<Integer> path = new ArrayList<>();
            room.add(path);
        }
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            room.get(a).add(b);
            room.get(b).add(a);
        }

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(1);
        dq.addLast(0);
        while(!dq.isEmpty()) {
            int q = dq.removeFirst();
            int pre = dq.removeFirst();
            if(post[q] == -1) {
                post[q] = pre;
                for(int i = 0; i < room.get(q).size(); i++) {
                    int x = room.get(q).get(i);
                    if(post[x] == -1) {
                        dq.addLast(x);
                        dq.addLast(q);
                    }
                }
            }
        }

        for(int i = 2; i <= N; i++) {
            if(post[i] == -1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for(int i = 2; i <= N; i++) {
            System.out.println(post[i]);
        }
    }
}