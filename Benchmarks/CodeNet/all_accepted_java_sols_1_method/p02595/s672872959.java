import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
// import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int D = sc.nextInt();

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            double calcResult = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
            if (calcResult <= D) {
                result += 1;
            }
        }
        
        pw.println(result);
        br.close();
        pw.close();
    }
}