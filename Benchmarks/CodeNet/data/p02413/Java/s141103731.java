import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] sizes = br.readLine().split(" ");
        int r = Integer.parseInt(sizes[0]);
        int c = Integer.parseInt(sizes[1]);
        int suma = 0;
        int[][] total = new int[r+1][c+1];
        
        for(int i=0; i<r ; i++) {
            String[] s_row = br.readLine().split(" ",c);
            for(int j=0; j<c ; j++) {
                total[i][j] = Integer.parseInt(s_row[j]);
                total[i][c] += total[i][j];
                total[r][j] += total[i][j];
                total[r][c] += total[i][j];
            }
        }
        
        String last = "";
        for(int[] row : total) {
            char first = '0';
            for(int col: row) {
                if(first == '0') {
                    first = '1';
                    last += String.valueOf(col);
                } else {
                    last += " " + String.valueOf(col);
                }
            }
            last += "\n";
        }
        last = last.substring(0, last.length() - 1);
        System.out.println(last);
    }
}
