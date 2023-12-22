import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        str = br.readLine();
        int x = Integer.parseInt(str.trim());
        int[] line = new int[x];

        for(int i=0;i<x;i++){
            line[i] = Integer.parseInt(br.readLine());
        }

        int ans = -1000000000;
        int Ri = line[0];
        for(int i=1;i<x;i++){
            if(line[i] - Ri >ans){
                ans = line[i] - Ri;
            }
            if(Ri > line[i]){
                Ri = line[i];
            }

        }

        System.out.println(ans);

        br.close();
    }

    
}

