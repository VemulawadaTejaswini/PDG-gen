import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][d];
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < d; j++) {
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        br.close();
        for (int i = 1; i < n; i++) {
            double sumsqr = 0;
            for (int j = 1; j <= i; j++) {
                for(int k=0;k<d;k++){
                    sumsqr += Math.pow(Math.abs(arr[i][k] - arr[i -j][k]), 2);
                }
                double dist = Math.sqrt(sumsqr);
                if (dist==Math.floor(dist)) {
                    count++;
                }
                sumsqr = 0;
            }

        }
        System.out.println(count + "\n");
    }
}
