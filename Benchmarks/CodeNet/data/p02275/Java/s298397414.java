mport java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(" ");
        int[] A = new int[n];
        //int max = 0;                                                                   
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(in[i]);
        }
        int[] B = new int[n + 1];
        int[] ans = new int[n + 1];
        ans = countingSort(A, B, n);

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(i != 1) sb.append(" ");
            sb.append(B[i]);
        }
        System.out.println(sb);

    }
  public static int[] countingSort(int[] A, int[] B, int n){
        int k = 10000 + 1;
        int[] C = new int[k];

        for(int j = 0; j < n; j++){
            C[A[j]]++;
        }

        for(int i = 0; i < k - 1; i++){
            C[i+1] = C[i+1] + C[i];
        }

        for(int j = n - 1; j >= 0; j--){
            B[C[A[j]]] = A[j];
            C[A[j]]--;
        }

        return B;
    }


}