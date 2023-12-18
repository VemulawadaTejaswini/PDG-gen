import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[51];//0~50
        Arrays.fill(n, 0);
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                for(int k = 0;k<10;k++){
                    for(int l=0;l<10;l++){
                        n[i+j+k+l]++;
                    }
                }
            }
        }
        
        try{
            String s;
            while((s=br.readLine())!=null){
                System.out.println(n[Integer.parseInt(s)]);
            }
        }catch(Exception ex){
            System.exit(0);
        }
    }
}