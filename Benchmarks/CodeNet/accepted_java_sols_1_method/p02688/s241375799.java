import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Set<Integer> notTargetSet = new HashSet<>();

        int result = 0;
        
        for(int i = 0; i < K; i++) {
            String d = br.readLine();
            String[] d_array = br.readLine().split(" ");

            for(String str : d_array) {
                notTargetSet.add(Integer.parseInt(str));
            }
        }

        for(int j = 1; j <= N; j++) {
            if(!notTargetSet.contains(j)) result++;
        }

        pw.print(result);
        br.close();
        pw.close();
    }
}