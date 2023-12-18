import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        str = br.readLine();
        int N = Integer.parseInt(str);
        
        str = br.readLine();
        String[] strs = str.split("\\s");
        int[] A = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            A[i] = Integer.parseInt(strs[i]);
        }

        for(int i=1;i<N;i++){
            StringBuilder sb = new StringBuilder();
            for(int k=0;k<N;k++){
                sb.append(A[k]);
                if(k != (N-1)){
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
            int v = A[i];//temp
            int j = i -1;
            while(j >=0 && A[j] > v){
                A[j+1] = A[j];
                j--;
                A[j+1] = v;//in order to exchange
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(A[i]);
            if(i != (N-1)){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}
