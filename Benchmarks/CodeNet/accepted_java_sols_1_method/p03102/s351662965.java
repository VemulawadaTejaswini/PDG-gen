
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int counter = 0;
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int[] temp = new int[M];
            for (int j=0; j<M; j++) {
                temp[j] = Integer.parseInt(st.nextToken());
            }
            int total = 0;
            for (int j=0; j<M; j++) {
                total += temp[j]*B[j];
            }
            total += C;
            if (total > 0) counter ++;
        }
        System.out.println(counter);
    }
}
