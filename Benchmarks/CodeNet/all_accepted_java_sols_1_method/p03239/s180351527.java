import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int t = Integer.parseInt(tokenizer.nextToken());
        int minCost = 1000011;
        int c1, t1;
        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(input.readLine());
            c1 = Integer.parseInt(tokenizer.nextToken());
            t1 = Integer.parseInt(tokenizer.nextToken());
            if (t1 <= t)
                minCost = Math.min(minCost, c1);
        }
        System.out.println(minCost== 1000011? "TLE" : minCost);
    }
}
