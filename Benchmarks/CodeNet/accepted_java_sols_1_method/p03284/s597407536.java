import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int [] data = new int[m];
        Arrays.fill(data, n/m);
        int index = 0;
        int reminder = n % m;
        while (reminder > 0){
            data[index]++;
            index++;
            index %= m;
            reminder--;
        }
        System.out.println(data[0]  - data[m -1]);
    }
}
