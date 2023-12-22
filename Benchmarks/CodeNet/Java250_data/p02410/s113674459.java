import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int a[][] = new int[n][m];
        int b[] = new int[m];
        int c[] = new int[n];
        for(int i=0;i<n;i++){
            str = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                a[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i=0;i<m;i++){
            b[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i] = c[i] + a[i][j] * b[j];
            }
            System.out.println(c[i]);
        }
    }
}