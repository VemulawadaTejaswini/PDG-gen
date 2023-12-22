import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in1 = br.readLine().split(" ");
    int N = Integer.parseInt(in1[0]);
    int M = Integer.parseInt(in1[1]);

    List<Integer>[] graph = new List[3 * N];
    for(int i = 0; i < 3 * N; i++) graph[i] = new ArrayList<Integer>();

    for(int i = 0; i < M; i++){
      in1 = br.readLine().split(" ");
      int u = Integer.parseInt(in1[0]);
      int v = Integer.parseInt(in1[1]);
      u--; v--;
      graph[3 * u].add(3 * v + 1);
      graph[3 * u + 1].add(3 * v + 2);
      graph[3 * u + 2].add(3 * v);
    }

    in1 = br.readLine().split(" ");
    int S = Integer.parseInt(in1[0]);
    int T = Integer.parseInt(in1[1]);
    S--;
    T--;
    S *= 3;
    T *= 3;

    br.close();

    int[] minPath = new int[3 * N];
    Arrays.fill(minPath, -1);
    minPath[S] = 0;

    Queue<Integer> que = new ArrayDeque<>();
    que.add(S);

    while(!que.isEmpty()){

      int edge = que.poll();

      for(int next : graph[edge]){
        if(minPath[next] != -1) continue;

        minPath[next] = minPath[edge] + 1;
        que.add(next);
      }
    }

    int ans = minPath[T];
    if(ans == -1 || ans % 3 != 0) System.out.println(-1);
    else System.out.println(ans / 3);
  }
}