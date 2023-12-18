import java.util.Scanner;

import static java.lang.Long.max;
import static java.lang.Math.min;

/**
 * Created by shoya on 2017/04/14.
 */
public class Main {
    final int INF = 100_000_000;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        PriRSQ rsq = new PriRSQ(n);
        for (int i = 0; i < q; i++){
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (com == 0)
                rsq.add(x, y);
            else
                System.out.println(rsq.getSum(x, y + 1));

            //System.out.printf("%d %d %d\n", com, x, y);
            //rsq.print();
            //System.out.println("\n");
        }
    }


    public static class PriRSQ {
        long nodes[];
        int size;

        PriRSQ(int n){
            int c = 1;
            while (n >= c) c *= 2;
            nodes = new long[2 * c - 1];
            size = c;
            for (int i = 0; i < 2 * c - 1; i++)
                nodes[i] = 0;
        }

        public void add(int node, int val){
            int child = node + size - 1;
            nodes[child] += val;
            while (child != 0){
                child = (child - 1) / 2;
                nodes[child] = nodes[child * 2 + 1] + nodes[child * 2 + 2];
            }
        }

        public long getSum(int queryl, int queryr){
            return getSum(queryl, queryr, 0, 0, size);
        }


        private long getSum(int queryl, int queryr, int root, int left, int right){
            //System.out.printf("%d <--> %d - %d <--> %d - Val %d\n", queryl, queryr, left, right, root);
            if (right <= queryl || queryr <= left)
                return 0;
            if (queryl <= left && right <= queryr)
                return nodes[root];

            long vl = getSum(queryl, queryr, root * 2 + 1, left, (left + right) / 2);
            long vr = getSum(queryl, queryr, root * 2 + 2, (left + right) / 2, right);
            return vl + vr;
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