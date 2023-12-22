import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] ans = new int[n+1];
        String[] road;
        int city1, city2;
        
        for (int i = 0; i < m; i++) {
            road = br.readLine().split(" ");
            city1 = Integer.parseInt(road[0]);
            city2 = Integer.parseInt(road[1]);
            ans[city1]++;
            ans[city2]++;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(ans[i]);
        }
    }
}
