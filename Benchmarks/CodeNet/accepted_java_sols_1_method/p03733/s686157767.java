import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int T =sc.nextInt();
        int tc=0;
        int time[] =new int[N];
        int x=1;
        for(int i=0;i<N;i++){
            time[i] =sc.nextInt();
        }
        
        
        
        int count=T;
        
        for(int i=1;i<N;i++){
           if((time[i]-time[i-1])<T){
               count +=(time[i]-time[i-1]);
           }else{
               count+=T;
           }
                
        }
        
        System.out.println(count);
        
    }       
    
        
}
