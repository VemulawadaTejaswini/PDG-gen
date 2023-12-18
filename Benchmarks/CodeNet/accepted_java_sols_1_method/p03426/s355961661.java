import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String HWD = br.readLine();
        int H = Integer.parseInt(HWD.split(" ")[0]);
        int W = Integer.parseInt(HWD.split(" ")[1]);
        int D = Integer.parseInt(HWD.split(" ")[2]);
     
        int[] Hei = new int[H*W+1];
        int[] Wid = new int[H*W+1];
        
        for(int i = 0; i < H; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < W; j++){
                int temp = Integer.parseInt(line[j]);
                Hei[temp] = i;
                Wid[temp] = j;
            }
        }
        
        int[] leng = new int[H*W+1];
        
        for(int x = D+1; x <= H*W; x++){
            leng[x] = leng[x-D] + Math.abs(Hei[x] - Hei[x-D]) + Math.abs(Wid[x] - Wid[x-D]);
        }
        
        int Q = Integer.parseInt(br.readLine());
        while(Q-- > 0){
            String str = br.readLine();
            int start = Integer.parseInt(str.split(" ")[0]);
            int end = Integer.parseInt(str.split(" ")[1]);
            
            System.out.println(leng[end] - leng[start]);
        }
    }

}
