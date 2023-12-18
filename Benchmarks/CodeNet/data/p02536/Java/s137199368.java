import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CConnectCities solver = new CConnectCities();
        solver.solve(1, in, out);
        out.close();
    }
    
    static class CConnectCities {
        
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int ans = 0;
            DSU ds = new DSU(n);
            for (int i = 0; i < m; i++) {
                int a = Integer.parseInt(in.next()) - 1;
                int b = Integer.parseInt(in.next()) - 1;
                ds.merge(a, b);
            }
            ArrayList<ArrayList<Integer>> l = ds.groups();
//        debug(l);
            ans = l.size() - 1;
            // 出力
            out.println(ans);
            
            
        }
        
        class DSU {
            
            private int n;
            private int[] parentOrSize;
            
            DSU(int n) {
                this.n = n;
                parentOrSize = new int[n];
                Arrays.java.util.Arrays.fill(parentOrSize, -1);
            }
            
            int merge(int a, int b) {
                if (!(0 <= a && a < n)) {
                    throw new IndexOutOfBoundsException("a=" + a);
                }
                if (!(0 <= b && b < n)) {
                    throw new IndexOutOfBoundsException("b=" + b);
                }
                
                int x = leader(a);
                int y = leader(b);
                if (x == y) {
                    return x;
                }
                if (-parentOrSize[x] < -parentOrSize[y]) {
                    int tmp = x;
                    x = y;
                    y = tmp;
                }
                parentOrSize[x] += parentOrSize[y];
                parentOrSize[y] = x;
                return x;
            }
            
            int leader(int a) {
                if (parentOrSize[a] < 0) {
                    return a;
                } else {
                    parentOrSize[a] = leader(parentOrSize[a]);
                    return parentOrSize[a];
                }
            }
            
            java.util.ArrayList<java.util.ArrayList<Integer>> groups() {
                int[] leaderBuf = new int[n];
                int[] groupSize = new int[n];
                for (int i = 0; i < n; i++) {
                    leaderBuf[i] = leader(i);
                    groupSize[leaderBuf[i]]++;
                }
                java.util.ArrayList<java.util.ArrayList<Integer>> result = new java.util.ArrayList<>(n);
                for (int i = 0; i < n; i++) {
                    result.add(new java.util.ArrayList<>(groupSize[i]));
                }
                for (int i = 0; i < n; i++) {
                    result.get(leaderBuf[i]).add(i);
                }
                result.removeIf(java.util.ArrayList::isEmpty);
                return result;
            }
            
        }
        
    }
}

