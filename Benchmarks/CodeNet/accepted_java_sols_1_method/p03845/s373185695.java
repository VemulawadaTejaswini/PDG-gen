import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt((input).readLine());
        int [] problems  = new int[n];
        int sum = 0;
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < n; i++) {
            problems[i]  = Integer.parseInt(tokn.nextToken());
            sum += problems[i];
        }
        int m = Integer.parseInt((input).readLine());
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < m; i++) {
            tokn = new StringTokenizer(input.readLine());
            int p1 = Integer.parseInt(tokn.nextToken());
            int m1 = Integer.parseInt(tokn.nextToken());
            out.append((sum - problems[p1 - 1]) + m1).append("\n");
        }
        System.out.println(out);
    }
}
