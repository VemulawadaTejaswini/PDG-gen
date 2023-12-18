import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    
    
    
        for(int x = 0; x<b; x++){
            if(a==0&&b==0){
            break;
            }
            
            for(int y = 0; y<a; y++){
                System.out.print("#");
            }
            
            System.out.print("\n");
        }
    
    
    
    
    }
}