    import java.util.*;
     
    public class Main {
        public static void main(String[] args){
            // Your code here!
            Scanner sc = new Scanner(System.in);
            
            int N = sc.nextInt();
            
            int result = 0;
            int maxCount = 0;
            
            for(int i = 1; i <= N; i++){
                
                int count = 0;
                int num = i;
                
                while((num % 2) == 0){
                    count++;
                    num = num/2;
                }
                if(count >= maxCount){
                    maxCount = count;
                    result = i;
                }
            }
            
            System.out.println(result);
            
        }
        
    }