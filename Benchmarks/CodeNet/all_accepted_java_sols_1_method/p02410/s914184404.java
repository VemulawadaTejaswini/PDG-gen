import java.io.*;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) throws IOException {

        int n = 0;
        int m = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);

        int num_a[][];
        num_a = new int[n][m];

        for (int i = 0; i < n; i++) {

            String[] line1 = br.readLine().split(" ");

            for (int x = 0; x < m; x++) {
                num_a[i][x] = Integer.parseInt(line1[x]);
            }

        }
        
        int num_b[];
        int num_c[];
        num_b = new int[m];
        num_c = new int[n];
        
        for(int i = 0; i < m; i++) {
            num_b[i] = Integer.parseInt(br.readLine());
        }
        
        
        for(int i = 0; i < n; i++) {
            
            for(int x = 0; x < m; x++) {
                num_c[i] += num_a[i][x] * num_b[x];
            }
           
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(num_c[i]);
        }
    }

}