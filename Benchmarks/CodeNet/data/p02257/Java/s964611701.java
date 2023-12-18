mport java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Y
 */
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a;
        int c = 0;
        
        for(int i=0 ; i<N; i++){
            a = Integer.parseInt(br.readLine());
      
            for(int j = 2;j<=a-1;j++){
                if(a%j == 0) break; 
                if(j == a-1) c++;
            }
            
        }
        System.out.println(c);
        
        
        
    }
}