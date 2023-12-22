import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try{ String line1 = reader.readLine();
        int N = Integer.parseInt(line1);
        String line2 = reader.readLine();
        String[] split = line2.split(" ");
        int[] A = new int[N];
        for(int i = 0; i < N ; i ++){
            A[i] = Integer.parseInt(split[i]);
        }
        int count = 0;
        for(int j = 1; j<N;j++){
        for(int i = j;i >= 1; i-- ){
            if(A[i-1] > A[i]){
                int temp = A[i-1];
                A[i-1] = A[i];
                A[i] = temp;
                count ++;
            }
        }}
        for(int i = 0; i<N; i++){
            if(i != N-1){
                System.out.print(A[i] + " ");
            }else{
                System.out.println(A[i]);
            }
        }
        System.out.println(count);
       }catch(IOException e){

       }
    }
}
