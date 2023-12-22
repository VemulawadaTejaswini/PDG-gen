import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = 0;
        int b = 0;
        String str ="";
        
        
        
        for(int r=0;r<3000;r++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        
        if(a==0&&b==0){
            break;
        }
        
        else if(a<b){
            System.out.println(a+" "+b);
        }
        
        else if(a>b){
            System.out.println(b+" "+a);
        }
        
        else if(a==b){
            System.out.println(a+" "+b);
        }
        
        
        
        
        
        }
        
    }
    
}