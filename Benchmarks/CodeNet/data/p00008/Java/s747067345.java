import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[50];
        Arrays.fill(n,0);
        for(int a = 0;a < 10;a++){
            for(int b = 0;b < 10;b++){
                for(int c = 0;c < 10;c++){
                    for(int d = 0;d < 10;d++){
                        n[a+b+c+d]++;
                    }
                }
            }
        }
        try{
            while(true){
            String st = br.readLine();
            if(st ==null) break; 
            int x = Integer.parseInt(st);
            System.out.println(n[x]);
            }
        }catch(IOException ex){            
        }
    }
}