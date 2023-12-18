
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        // boolean[][] isFriend = new boolean[n][n]; // 100000 * 100000 大丈夫? -> いいえ

        ArrayList<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int f1 = sc.nextInt();
            int f2 = sc.nextInt();
            g[f1].add(f2);
            g[f2].add(f1);
        }

        // Connected Component Number 
        int[] ccNum = makeCCNum(g, n);
//        UArr.printArr(ccNum);
        
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int f1 = sc.nextInt();
            int f2 = sc.nextInt();
            System.out.println(ccNum[f1] == ccNum[f2] ? "yes" : "no");
        }
    }

    // 1つの連結成分につき1つ番号を与える。同じ連結成分を構成する点は同じ番号をもつ。
    static int[] makeCCNum(ArrayList<Integer>[] g, int n) {
        int[] ccNum = new int[n];
        int num = 1;
        boolean[] v = new boolean[n]; // visited?
        for (int i = 0; i < n; i++) {
            if (v[i])
                continue;

            // 未到達の点から連結成分を作成
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(i);
            
            while (!q.isEmpty()) {
                int top = q.poll();
                v[top] = true;
                ccNum[top] = num;

                for (int adj : g[top]) {
                    if (!v[adj]) {
                        v[adj] = true;
                        q.add(adj);
                        ccNum[adj] = num;
                    }
                }
            }

            // 次の連結成分には別の番号をつける
            num++;
        }
        return ccNum;
    }
}

