import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());


        int[] h = new int[n]; // nums
        st = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }


        int[] min_cost = new int[n];

        // 2 <= N <= 10^5
        min_cost[0] = 0;
        min_cost[1] = Math.abs(h[1] - h[0]);

        for (int i = 2; i < min_cost.length; i++) {

            min_cost[i] = Math.min( min_cost[i - 2] + Math.abs( h[i - 2] - h[i] ) ,
                    min_cost[i - 1] + Math.abs( h[i-1] - h[i] ) );
        }

        /*for (int i : min_cost) {
            System.out.print(String.valueOf(i) + " ");
        }*/
        // System.out.println();

        System.out.println(min_cost[min_cost.length - 1]);
    }
}