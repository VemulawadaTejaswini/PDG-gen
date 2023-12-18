import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        String[] in = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(in[i]);
        }
        int q = partition(A, 0, n - 1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i != 0) sb.append(" ");
            if(i == q) sb.append("[").append(A[i]).append("]");
            else sb.append(A[i]);
        }
        System.out.println(sb);
    }

    public static int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p - 1, temp;
        for(int j = p; j < r; j++){
            if(A[j] <= x){
                i = i + 1;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }

}