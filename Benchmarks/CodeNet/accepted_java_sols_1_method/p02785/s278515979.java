import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        String[] in2 = br.readLine().split(" ");
        int N = Integer.parseInt(in1[0]);
        int K = Integer.parseInt(in1[1]);
        br.close();

        if(K >= N) {
            System.out.println(0);
            System.exit(0);
        }

        List<Long> H = Arrays.stream(in2)
                        .mapToLong(Long::parseLong)
                        .sorted()
                        .boxed().collect(Collectors.toList());
        
        long sum = 0;
        for(int i = 0; i < N - K; i++){
            sum += H.get(i);
        }
        System.out.println(sum);
    }
}