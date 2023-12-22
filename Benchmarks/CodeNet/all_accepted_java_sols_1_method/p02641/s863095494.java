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

        int X = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        if(N == 0) {
            pw.println(X);
            br.close();
            pw.close();
            return;
        }

        String[] input_array = br.readLine().split(" ");

        Set<Integer> checkSet = new HashSet<>();

        for(String str : input_array) {
            checkSet.add(Integer.parseInt(str));
        }

        int up = X;
        int down = X;
        int increment = 1;

        if(!checkSet.contains(X)) {
            pw.println(X);
            br.close();
            pw.close();
            return;
        }

        while(up != 100 || down != 0) {
            up += increment;
            down -= increment;

            if(!checkSet.contains(down)) {
                pw.println(down);
                break;
            } else if(!checkSet.contains(up)) {
                pw.println(up);
                break;
            }
        } 

        br.close();
        pw.close();
    }
}