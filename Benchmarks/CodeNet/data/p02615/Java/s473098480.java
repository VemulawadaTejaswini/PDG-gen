
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] friendliness = new int[n];
        String[] s = br.readLine().split(" ");
        long answer = 0L;
        for(int i=0;i<n;i++){
            friendliness[i] = Integer.parseInt(s[i]);
            answer += (long)friendliness[i];
        }
        int max = Arrays.stream(friendliness).min().getAsInt();
        System.out.println(answer - max);
    }
}