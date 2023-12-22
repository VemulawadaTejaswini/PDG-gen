import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int cm[][] = new int[h + 2][w + 2];
        Deque<Integer> que = new ArrayDeque<>();
        for (int i = 1; i <= h; i++) {
            String s = sc.next();
            for (int j = 1; j <= w; j++) {
                if (".".equals(s.substring(j - 1, j))) {
                    cm[i][j] = -1;
                } else {
                    que.add(i);
                    que.add(j);
                }
            }
        }
        sc.close();
        int ans = 0;
        while (que.size() > 0) {
            int y = que.poll();
            int x = que.poll();
            ans = cm[y][x] + 1;
            if (cm[y + 1][x] == -1) {
                cm[y + 1][x] = ans;
                que.add(y + 1);
                que.add(x);
            }
            if (cm[y - 1][x] == -1) {
                cm[y - 1][x] = ans;
                que.add(y - 1);
                que.add(x);
            }
            if (cm[y][x + 1] == -1) {
                cm[y][x + 1] = ans;
                que.add(y);
                que.add(x + 1);
            }
            if (cm[y][x - 1] == -1) {
                cm[y][x - 1] = ans;
                que.add(y);
                que.add(x - 1);
            }
        }
        System.out.println(ans - 1);
    }
}