import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int X = Integer.parseInt(NK[1]);
        int[] L = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        for(int i = 1; i < N; i++){
            L[i] += L[i-1];
        }
        
        int count = 1;
        for(int i = 0; i < N; i++){
            if( L[i] <= X ) count++;
        }
        
        System.out.println(count);
    }
}
