import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0) break;

            int s = 0;
            for(int i = 0; i < 3; i++) {
                int num = sc.nextInt();
                for(int j = 0; j < num; j++) {
                    int x = sc.nextInt() - 1;
                    s += (int) Math.pow(3, x) * i;
                }
            }
            int g = 0;
            for(int i = 0; i < n; i++) {
                g *= 3;
                g += 1;
            }

            int[] cost = new int[(int) Math.pow(3, n)];
            cost[s] = 1;
            Deque<Integer> que = new ArrayDeque<>();
            que.add(s);

            while(!que.isEmpty()) {
                int i = que.poll();
                if(i == 0 || i == g * 2) break;
                if(cost[i] == m + 1) break;

                int top0 = -1;
                int top1 = -1;
                int top2 = -1;
                int tmp = i;
                for(int j = 0; j < n; j++) {
                    if(tmp % 3 == 0) top0 = j;
                    if(tmp % 3 == 1) top1 = j;
                    if(tmp % 3 == 2) top2 = j;
                    tmp /= 3;
                }

                if(top0 > top1) {
                    int ni = i + (int) Math.pow(3, top0);
                    if(cost[ni] == 0) {
                        cost[ni] = cost[i] + 1;
                        que.add(ni);
                    }
                }else if(top0 < top1) {
                    int ni = i - (int) Math.pow(3, top1);
                    if(cost[ni] == 0) {
                        cost[ni] = cost[i] + 1;
                        que.add(ni);
                    }
                }
                if(top1 > top2) {
                    int ni = i + (int) Math.pow(3, top1);
                    if(cost[ni] == 0) {
                        cost[ni] = cost[i] + 1;
                        que.add(ni);
                    }
                }else if(top1 < top2) {
                    int ni = i - (int) Math.pow(3, top2);
                    if(cost[ni] == 0) {
                        cost[ni] = cost[i] + 1;
                        que.add(ni);
                    }
                }
            }

            if(cost[0] > 0) System.out.println(cost[0] - 1);
            else if(cost[g * 2] > 0) System.out.println(cost[g * 2] - 1);
            else System.out.println(-1);
        }

        sc.close();
    }
}
