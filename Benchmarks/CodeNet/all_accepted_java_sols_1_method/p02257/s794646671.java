import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Y
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a;
        int c = 0;
        
        for(int i=0 ; i<N; i++){
            a = Integer.parseInt(br.readLine());
            
            if(a%2==0){
                if(a==2) c++;
            }else if(a%3==0){
                if(a==3) c++;
            }else if(a%7==0){
                if(a==7) c++;
            }else{
                for(int j = 2;j<=Math.sqrt(a);j++){
                    if(a%j == 0) break; 
                    if(j == Math.floor(Math.sqrt(a))) c++;
                }
            }  
        }
        System.out.println(c);
        
        
        
    }
}