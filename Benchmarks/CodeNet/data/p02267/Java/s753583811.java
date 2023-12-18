import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] S = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int q = Integer.parseInt(br.readLine());
        int [] T = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for(int i = 0; i < q; i++) {
            for(int j = 0; j < n; j++) {
                if(T[i] == S[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}