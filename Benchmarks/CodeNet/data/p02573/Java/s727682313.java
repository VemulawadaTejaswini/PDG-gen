import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    static class DSU{
        int[] parent;
        int[] size;

        public DSU(int N){
            parent = new int[N];
            size = new int[N];
            for(int i=0; i<parent.length; i++){
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x){
            if(parent[x]!=x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public int union(int x, int y){
            int xParent = find(x);
            int yParent = find(y);
            if(xParent==yParent) return size[xParent];
            if(size[xParent]<=size[yParent]){
                parent[xParent] = yParent;
                size[yParent]+=size[xParent];
                return size[yParent];
            }
            else{
                parent[yParent] = xParent;
                size[xParent] += size[yParent];
                return size[xParent];
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        DSU dsu = new DSU(n);
        int max = 1;
        for(int i=0; i<m; i++){
            int a = scanner.nextInt()-1;
            int b = scanner.nextInt()-1;
            max = Math.max(max, dsu.union(a,b));
        }
        System.out.println(max);
    }
}
