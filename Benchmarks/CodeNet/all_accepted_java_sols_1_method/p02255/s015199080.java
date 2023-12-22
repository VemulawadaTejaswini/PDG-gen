import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(input[i]);
        }
        int changeBox = 0;

        for(int i = 0; i < n; i++){
            if(i == n - 1){
                System.out.println(A[i]);
            }else{
                System.out.print(A[i] + " ");
            }
        }
        for(int i = 1; i < n; i++){
            changeBox = (A[i]);
            int j = i - 1;
            while(j >= 0 && changeBox < (A[j])){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = changeBox;
            for(int k = 0; k < n; k++){
                if(k == n - 1){
                    System.out.println(A[k]);
                }else{
                    System.out.print(A[k] + " ");
                }
            }
        }
    }
}