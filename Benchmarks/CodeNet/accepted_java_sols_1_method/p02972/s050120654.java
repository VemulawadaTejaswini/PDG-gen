import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        int[] A = Stream.of(strA).mapToInt(Integer::parseInt).toArray();
        
        // ボールを入れるか入れないか
        int[] B = new int[N];
        List<Integer> list = new ArrayList<>();
        
        for(int i = N; i >= 1; i--){
            int baisuu = 2;
            int ballCount = 0;
            while( i * baisuu <= N ) {
                ballCount += B[i*baisuu-1];
                ++baisuu;
            }

            if ( A[i-1] == ballCount % 2 ) continue;
            B[i-1] = 1;
            list.add(i);
        }
        
        System.out.println(list.size());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
            if (i != list.size() -1) sb.append(" ");
        }
        
        System.out.println(sb);
    }
}
