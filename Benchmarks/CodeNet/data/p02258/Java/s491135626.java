import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] R = new int[n];

        for(int i = 0; i < n; i++){
            R[i] = Integer.parseInt(br.readLine());
        }
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int diff = R[j] - R[i];
                if(max < diff){
                    max = diff;
                }
            }
        }
        System.out.println(max);
    }
}