import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        int i = 0;
        int[] arr = new int[N];

        while (tokenizer.hasMoreTokens()) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
            i++;
        }

        int[] cost = new int[N];

        cost[N-1] = 0;
        cost[N-2] = Math.abs(arr[N-2] - arr[N-1]);
        int leap;
        for (int j=N-3; j>=0; j--) {
            cost[j] = Integer.MAX_VALUE;

            for (int k=1; k <= K; k++){
                if (k + j > N-1){
                    break;
                }
                cost[j] = Math.min(cost[j+k] + Math.abs(arr[j] - arr[j+k]), cost[j]);
            }
        }

        System.out.println(cost[0]);
    }
}
