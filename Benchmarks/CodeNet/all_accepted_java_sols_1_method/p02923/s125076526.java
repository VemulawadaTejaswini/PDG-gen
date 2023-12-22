import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int maxCount = 0;
        int N = in.nextInt();
        int actual = in.nextInt();
        for (int i = 1; i < N; i++) {
            int siguiente = in.nextInt();
            if(actual >= siguiente){
                count++;
            }else{
                if(maxCount< count){
                    maxCount = count;
                }
                count = 0;
            }
            
            actual = siguiente;
            
        }
        
        if(maxCount< count){
            maxCount = count;
        }
        System.out.println(maxCount);
                
    }
    
}