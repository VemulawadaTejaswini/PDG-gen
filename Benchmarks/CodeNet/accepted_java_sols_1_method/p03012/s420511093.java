import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] W = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int S1 = Arrays.stream(W).sum();
        int S2 = 0;

        int min = Math.abs(S1 -S2);
        for(int i = 0; i < N; i++){
            S1 -= W[i];
            S2 += W[i];
            min = Math.min(min, Math.abs(S1 - S2));
        }
        
        System.out.println(min);
    }
}
