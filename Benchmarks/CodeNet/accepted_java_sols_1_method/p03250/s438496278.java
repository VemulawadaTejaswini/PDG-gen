import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int [] a  = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(a);
        System.out.println((a[2]*10 + a[1] + a[0]));
    }
}
