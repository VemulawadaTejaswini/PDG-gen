import java.util.Scanner;
import static java.lang.Math.min;

/**
 * Created by shoya on 2017/04/11.
 */
public class Main {
    final int INF = 100_000_000;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        PriRMQ rmq = new PriRMQ(n);
        for (int i = 0; i < q; i++){
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (com == 0)
                rmq.update(x, y);
            else
                System.out.println(rmq.find(x, y + 1, 0, 0, n + 1));

            //rmq.print();
            //System.out.println("\n");
        }
    }

    private static class PriRMQ {
        final long INF = (1 << 31) - 1;
        long nodes[];
        int size;

        PriRMQ(int n){
            int c = 1;
            while (n >= c) c *= 2;
            nodes = new long[2 * c - 1];
            size = c;
            for (int i = 0; i < 2 * c - 1; i++)
                nodes[i] = INF;
        }

        void update(int node, int val){
            int child = node + size - 1;
            nodes[child] = val;
            while (child != 0){
                child = (child - 1) / 2;
                nodes[child] = min(nodes[child * 2 + 1], nodes[child * 2 + 2]);
            }
        }

        long find(int queryl, int queryr, int root, int left, int right){
            if (right <= queryl || queryr <= left)
                return INF;
            if (queryl <= left && right <= queryr)
                return nodes[root];
 
            long vl = find(queryl, queryr, root * 2 + 1, left, (left + right) / 2);
            long vr = find(queryl, queryr, root * 2 + 2, (left + right) / 2, right);
            return min(vl, vr);
        }

        void print(){
            int tmp = 1;
            for (int i = 0; i < 2 * size - 1; i++){
                if (i == tmp) {
                    System.out.println();
                    tmp += ((tmp + 1) / 2) * 2;
                }
                System.out.printf("%d ", nodes[i]);
            }
        }

    }
}