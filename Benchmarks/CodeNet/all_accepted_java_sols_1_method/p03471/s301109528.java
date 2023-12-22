import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Y = sc.nextInt();
        
        boolean flag = false;
        
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= (N-i); j++){
                for(int k = 0; k <= (N-i-j) ; k++){
                    int sum = 0;
                    int count = 0;
                     
                    sum = (10000 * i) + (5000 * j) + (1000 * k);
                    count = i + j + k;
                    if(sum == Y && count == N){
                        System.out.println(i + " " + j + " " + k);
                        flag = true; 
                        break;
                    }
                }
                
                if(flag){
                    break;
                }
            }
            
            if(flag){
                break;
            }
        }
        
        if(flag == false){
            System.out.println("-1 -1 -1");
        }
        
    }
    
}
