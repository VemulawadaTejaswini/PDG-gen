import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int [][] arr = new int[2][n];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int best = 0, row_jump = 0;
        for(int k = 0; k < n; k++){
            int sum = 0, i = 0;
            for (int j = 0; j < n; j++){
                sum += arr[i][j];
                if (i == 0 && j == row_jump){
                    i++;
                    row_jump++;
                    sum += arr[i][j];
                }
            }
            best = Math.max(best, sum);
        }
        System.out.println(best);
    }
}