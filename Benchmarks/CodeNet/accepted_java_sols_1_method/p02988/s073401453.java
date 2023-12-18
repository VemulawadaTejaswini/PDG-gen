import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] P = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 
        
        int count = 0;
        for(int i = 1; i < N - 1; i++){
            if ( P[i-1] < P[i] && P[i] < P[i+1] ) count++;
            if ( P[i-1] > P[i] && P[i] > P[i+1] ) count++;
        }
        
        System.out.println(count);

    }
}
