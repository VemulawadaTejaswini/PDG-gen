import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String[] ia; 

                while(true){
                        ia = in.readLine().split(" ");
                        int N = Integer.parseInt(ia[0]);
                        int K = Integer.parseInt(ia[1]);
                        if(N == 0 && K == 0){ 
                                break;
                        }   
                        int[] S = new int[K];
                        ia = in.readLine().split(" ");
                        for(int i = 0;i < K; ++i){
                                S[i] = Integer.parseInt(ia[i]);
                        }   
                        for(int i = 0;i < N; ++i){
                                ia = in.readLine().split(" ");
                                for(int j = 0;j < K; ++j){
                                        S[j] -= Integer.parseInt(ia[j]);
                                }   
                        }   
                        boolean yet = true;
                        for(int i = 0;i < K; ++i){
                                if(S[i] < 0){ 
                                        yet = false;
                                        break;
                                }   
                        }   
                        if(yet){
                                System.out.println("Yes");
                        } else {
                                System.out.println("No");
                        }   
                }   
        }   
}