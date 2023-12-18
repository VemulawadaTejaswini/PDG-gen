import java.util.*;
import java.io.*;

public class Maine{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = 1;
    int b = 1;
    
    
        while(!(a==0&&b==0)){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        
        for(int x = 0; x<b; x++){
            
            
            for(int y = 0; y<a; y++){
                System.out.print("#");
            }
            
            System.out.print("\n");
        }
        
        System.out.print("\n");
        }
        System.out.print("\n");
    }
}