import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    Map<Integer, Set<Integer>> map = new HashMap<>();
    int[] sign;

    Queue<Integer> que = new ArrayDeque<>();

    private void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        sign = new int[n];
        Arrays.fill(sign, -1);

        for (int i = 0; i < n; i++) {
            map.put(i, new HashSet<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            map.get(a).add(b);
            map.get(b).add(a);
        }

        que.add(0);

        while (!que.isEmpty()) {
            int i = que.poll();
            for (int next : map.get(i)) {
                // 道標がなかったらつける
                if (sign[next] == -1) {
                    sign[next] = i;
                    que.add(next);
                }
            }
        }

        for (int i = 1; i < n; i++) {
            // たどり着けないものが残っていればNo
            if (sign[i] == -1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        for (int i = 1; i < n; i++) {
            System.out.println(sign[i] + 1);
        }
    }
}

