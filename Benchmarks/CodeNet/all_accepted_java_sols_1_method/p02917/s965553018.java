import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            int A[] = new int[N];
            String strSplit[] = br.readLine().split(" ");
            int B[] = new int[N-1];
            
            for(int i=0; i<N-1; i++){
                B[i] = Integer.parseInt(strSplit[i]);
            }

            A[0] = B[0];
            for(int i=1; i<N-1; i++){
                A[i] = Math.min(B[i],B[i-1]);
            }
            A[N-1] = B[N-2];
            
            int result = 0;
            for(int i=0; i<N; i++){
                result = result + A[i];
            }
            
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}