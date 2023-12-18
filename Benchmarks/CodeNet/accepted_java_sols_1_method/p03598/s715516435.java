import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int x;
        int runDistance = 0;
 
        for(int i = 0; i < N; i++){
            x = sc.nextInt();
            if(x < K - x){
                runDistance += 2 * x;
            }else{
                runDistance += 2 * (K - x);
            }
        }
 
        System.out.println(runDistance);
        
    }
}