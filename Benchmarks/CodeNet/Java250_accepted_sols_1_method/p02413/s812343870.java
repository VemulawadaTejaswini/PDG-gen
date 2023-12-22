import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        int[] rowSum = new int[m];
        for (int i = 0; i < n; i++) {
            lines = br.readLine().split(" ");
            int columnSum=0;
            for (int j = 0; j < m; j++) {
                 int e= Integer.parseInt(lines[j]);
                 columnSum+=e;
                 rowSum[j]+=e;
                 System.out.print(e+" ");
            }
            System.out.println(columnSum);
        }
        int totalSum=0;
        for(int i=0;i<m;i++){
            totalSum+=rowSum[i];
            System.out.print(rowSum[i]+" ");
        }
        System.out.println(totalSum);

    }
}