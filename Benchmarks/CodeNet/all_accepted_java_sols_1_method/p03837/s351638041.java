import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // @DONE

        // Run a Floyd-Warshall or osmething
        Set<Integer> unvisited = new HashSet<>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer start = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(start.nextToken());
        int m = Integer.parseInt(start.nextToken());


        int[][] dist = new int[n][n];
        int[][] next = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE/3;
                next[i][j] = -1;
            }
        }

        for(int j = 0; j < m; j++) {
            StringTokenizer path = new StringTokenizer(in.readLine());
            int begin = Integer.parseInt(path.nextToken()) - 1;
            int end = Integer.parseInt(path.nextToken()) - 1;
            int length = Integer.parseInt(path.nextToken());

            dist[begin][end] = length;
            dist[end][begin] = length;
            next[begin][end] = end;
            next[end][begin] = begin;
            unvisited.add(begin*n + end);
            unvisited.add(end*n + begin);
        }

        //System.out.println(unvisited);

        for(int i = 0; i < n; i++) {
            dist[i][i] = 0;
            next[i][i] = i;
        }


        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }

        //System.out.println(Arrays.deepToString(dist));
        //System.out.println(Arrays.deepToString(next));

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(next[i][j] != -1){
                    int a = i;
                    int b = j;
                    while(a != b) {
                        //System.out.println(a + " " + b + " " + next[a][b]);
                        int c = next[a][b];
                        unvisited.remove(a*n + c);
                        unvisited.remove(c*n + a);
                        a = c;
                    }
                }
            }
        }

        //System.out.println(unvisited);
        System.out.println(unvisited.size()/2);
    }
}
