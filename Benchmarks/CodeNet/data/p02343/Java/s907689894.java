import java.util.Scanner;

/**
 * Created by shoya on 2017/04/11.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        UFT uft = new UFT(n);
        for (int i = 0; i < q; i++){
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (com == 0)
                uft.unite(x, y);
            else
                System.out.println(uft.same(x, y));
            //uft.print();
            //System.out.println();
        }
    }

    private static class UFT {
        int size;
        int rootsOfNodes[];

        UFT(int n){
            size = n;
            int i = 1;
            while (i < n) i *= 2;
            rootsOfNodes = new int[n];
            for (int j = 0; j < n; j++)
                rootsOfNodes[j] = j;
        }

        private int depth(int node, int depth){
            if (node == rootsOfNodes[node])
                return depth;
            return depth(rootsOfNodes[node], depth + 1);
        }

        void unite(int x, int y){
            int lower;
            int root;
            if (depth(x, 0) > depth(y, 0)) {
                lower = x;
                root = root(y);
            }
            else {
                lower = y;
                root = root(x);
            }
            while(lower != rootsOfNodes[lower]){
                int next = rootsOfNodes[lower];
                rootsOfNodes[lower] = root;
                lower = next;
            }
            rootsOfNodes[lower] = root;
        }

        private int root(int node) {
            if (node == rootsOfNodes[node])
                return node;
            return root(rootsOfNodes[node]);
        }

        boolean same(int x, int y){
            return root(x) == root(y);
        }

        void print(){
            for (int i = 0; i < size; i++)
                System.out.printf("%d <-- Root -- %d\n", rootsOfNodes[i], i);
        }

    }
}