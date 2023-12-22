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
        int[] line = new int[N];
        for(int i=0;i<N;i++){
            line[i] = Integer.parseInt(strs[i]);
        }

        int ans =0;

        for(int i=0;i<N;i++){
            for(int j = N-1;j >= 1; j--){
                if(line[j] < line[j -1]){
                    ans++;
                    int temp = line[j-1];
                    line[j -1] = line[j];
                    line[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0;i<N;i++){
            if(i != N -1){
            sb.append(String.valueOf(line[i]));
            sb.append(" ");
            }else{
                sb.append(String.valueOf(line[i]));
            }
        }
        sb.append("\n");
        sb.append(String.valueOf(ans));
        System.out.println(sb.toString());
        br.close();
    }

    
}
