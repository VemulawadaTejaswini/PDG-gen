import java.util.*;

public class Main {    
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);                
         
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int count[] = new int[N];
        
        for(int i = 0;i < M;i++){
            count[sc.nextInt() - 1]++;
            count[sc.nextInt() - 1]++;
        }
                     
        for(int i = 0;i < N;i++){
            System.out.println(count[i]);
        }       
        
    }            
}
