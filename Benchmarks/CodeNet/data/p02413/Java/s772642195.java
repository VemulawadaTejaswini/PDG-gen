import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strArray = input.split(" ");

        int r = Integer.parseInt(strArray[0]);  //???r
        int c = Integer.parseInt(strArray[1]);  //???c

        int[][] A = new int[r][c];

//      ??????A???????????????
        for(int i = 0; i < r; i++){
            input = br.readLine();
            strArray = input.split(" ");
            for(int j = 0; j < c; j++){
                A[i][j] = Integer.parseInt(strArray[j]);
            }
        }
//      (r+1) ?? (c+1) ?????°????????¨?????????
        for(int i = 0; i < r+1; i++){
            int sum = 0;
            int ans = 0;
            for(int j = 0; j < c+1; j++){
                sum += A[i][j];

                if(i == r && j == c){
                    A[i][j] = sum;
                }
                ans = A[i][j];
            }
            System.out.println(ans);
        }
    }
}