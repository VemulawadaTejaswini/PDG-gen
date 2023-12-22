import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] tmpStr = br.readLine().split(" ");
            int[] linesq = new int[3];

            for(int j = 0; j < 3; j++){
                linesq[j] = Integer.parseInt(tmpStr[j]);
                linesq[j] *= linesq[j];
            }

            Arrays.sort(linesq);

            if(linesq[2] == linesq[1] + linesq[0] ){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}