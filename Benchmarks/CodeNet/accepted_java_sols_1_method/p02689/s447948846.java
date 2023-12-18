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
        int M = Integer.parseInt(st.nextToken());

        String[] input_array = br.readLine().split(" ");

        Set<Integer> notSet = new HashSet<>();

        for(int i = 0; i < M; i++) {
            String[] str_array = br.readLine().split(" ");

            int a = Integer.parseInt(str_array[0]);
            int b = Integer.parseInt(str_array[1]);

            if(Integer.parseInt(input_array[a-1]) > Integer.parseInt(input_array[b-1])) {
                notSet.add(b);
            } else if(Integer.parseInt(input_array[a-1]) < Integer.parseInt(input_array[b-1])) {
                notSet.add(a);
            } else {
                notSet.add(a);
                notSet.add(b);
            }
        }
        
        pw.print(N - notSet.size());
        br.close();
        pw.close();
    }
}