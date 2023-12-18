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

        int Max = -1000000000;
        for(int i=0;i<x;i++){
            int R1 = line[i];
            for(int j = i+1;j<x;j++){
                int R2 = line[j];
                int temp = R2- R1;
                if(Max < temp){
                    Max = temp;
                    //System.out.println(R2 + " - " + R1 + "="  + temp + "  " + Max );
                }
            }
        }

        System.out.println(Max);

        br.close();
    }

    
}
