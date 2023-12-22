import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int r = Integer.parseInt(str[0]);
        int c = Integer.parseInt(str[1]);
        int[][] a = new int[r+1][c+1];
        for(int i=0;i<r;i++){
            str = br.readLine().split(" ");
            for(int j=0;j<c;j++){
                a[i][j] = Integer.parseInt(str[j]);
                a[i][c] += a[i][j];
                a[r][j] += a[i][j];
            }
            a[r][c] += a[i][c];
        }
        for(int i=0;i<r+1;i++){
            for(int j=0;j<c+1;j++){
                if(j<c) System.out.print(a[i][j]+" ");
                else System.out.println(a[i][j]);
            }
        }
    }
}