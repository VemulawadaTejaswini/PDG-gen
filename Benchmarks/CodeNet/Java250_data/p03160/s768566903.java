import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        int N = Integer.parseInt(input.readLine());
        StringTokenizer st = new StringTokenizer(input.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i<N; i++){
            if(i+1<N) dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(arr[i] - arr[i+1]));
            if(i+2<N) dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(arr[i] - arr[i+2]));
        }
        output.println(dp[N-1]);

        /*boolean[] visited = new boolean[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(1, Math.abs(arr[0] - arr[1])));
        if(N>2)
            pq.add(new Node(2, Math.abs(arr[0] - arr[2])));

        while(!pq.isEmpty()){
            Node n = pq.poll();
            if(visited[n.i]) continue;
            visited[n.i] = true;
            if(n.i == N-1){
                output.println(n.d);
                break;
            }
            if(n.i<N-1)
                pq.add(new Node(n.i+1, n.d + Math.abs(arr[n.i] - arr[n.i+1])));
            if(n.i<N-2)
                pq.add(new Node(n.i+2, n.d + Math.abs(arr[n.i] - arr[n.i+2])));
        }
        */
        output.close();
    }
}