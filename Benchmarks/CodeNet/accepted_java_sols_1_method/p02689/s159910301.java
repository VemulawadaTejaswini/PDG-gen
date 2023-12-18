import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Harry on 5/3/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] h = new int[n+1];
        for(int i=0; i<n; i++){
            h[i+1] = scanner.nextInt();
        }
        int[][] edges = new int[m][2];
        for(int i=0; i<m; i++){
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }
        List<Integer>[] graph = new List[n+1];
        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] e : edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        int res = 0;
        for(int o=1; o<=n; o++){
            boolean isGood = true;
            for(int next : graph[o]){
                if(h[next]>=h[o]){
                    isGood = false;
                    break;
                }
            }
            res += isGood ? 1 : 0;
        }
        System.out.println(res);
    }
}
