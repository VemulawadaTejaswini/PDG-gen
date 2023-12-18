import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String[] strArray = br.readLine().split(" ");

        int result = 0;

        for(int i = 0; i < N; i++) {
            for(int j = i +1; j < N; j++) {
                for(int k = j +1; k < N; k++) {
                    int a = Integer.parseInt(strArray[i]);
                    int b = Integer.parseInt(strArray[j]);
                    int c = Integer.parseInt(strArray[k]);

                    if(a + b > c && b + c > a && c + a > b &&
                        a != b && b != c && c != a) result++;
                }    
            }
        }
        

        pw.println(result);
        br.close();
        pw.close();
    }
}