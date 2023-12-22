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
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(strs[i]);
        }

        int count = 0;
        for(int i=0; i<N; i++){
            int minj = i;
            for(int j= i; j<N; j++){
                if(A[j] < A[minj]){
                    minj = j;
                }
            }
            if( i != minj){
                int temp = A[i];
                A[i] = A[minj];
                A[minj] = temp;
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(A[i]);
            if(i != N-1){
                sb.append(" ");
            }
        }
        sb.append("\n");
        sb.append(count);

        System.out.println(sb.toString());

        br.close();
    }

    
}
