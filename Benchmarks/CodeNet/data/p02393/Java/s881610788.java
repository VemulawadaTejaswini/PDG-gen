import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    try{
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int[] num = {a,b,c};
        
        Arrays.sort(num);
        
            for (int i = 0; i < num.length; i++){
                System.out.print(num[i]);
                System.out.print(" ");
            }
        
    }catch(IOException e){}
    

    }
}