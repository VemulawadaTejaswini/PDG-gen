import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[n];

        int minj = 0;
        int changeBox = 0;
        int count = 0;

//      N????????´??°?????????A???????´?
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(input[i]);
        }

        for(int i = 0; i < n; i++){
            minj = i;

            for(int j = i; j < n; j++){
                if(A[j] < A[minj]){
                    minj = j;
                }
            }
            if(i != minj){
                changeBox = A[i];
                A[i] = A[minj];
                A[minj] = changeBox;
                count++;
            }
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                System.out.print(A[i]);
            }else{
                System.out.print(" " + A[i]);
            }
        }
        System.out.println();
        System.out.println(count);
    }
}