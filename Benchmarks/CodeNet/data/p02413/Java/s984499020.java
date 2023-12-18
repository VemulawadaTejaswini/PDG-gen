import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] arr = br.readLine().split(" ");
            int r = Integer.parseInt(arr[0]), c = Integer.parseInt(arr[1]);
            int[][] table = new int[r+1][c+1];
            int[] lastRow = new int[c+1];
            int total = 0;
            
            for(int i=0; i<r; i++){
                String[] a = br.readLine().split(" ");
                for(int j=0; j<a.length; j++){
                    table[i][j] = Integer.parseInt(a[j]);
                }
            }
            
            for(int row=0; row<r; row++){
                int tmp = 0;
                for(int col=0; col<c; col++){
                    tmp += table[row][col];
                    lastRow[col] += table[row][col];
                }
                table[row][c] = tmp;
                total += tmp;
            }
            lastRow[c] = total;
            table[r] = lastRow;
            
            for(int i=0; i<=r; i++){
                StringJoiner sj = new StringJoiner(" ");
                Arrays.stream(table[i]).forEach(d -> sj.add(String.valueOf(d)));
                System.out.println(sj.toString());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

