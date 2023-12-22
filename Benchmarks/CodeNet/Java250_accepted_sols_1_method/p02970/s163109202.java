import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int D = sc.nextInt();
        int div = D*2 + 1;
        
        int ans = N / div;
        
        if(N % div != 0){
            ans ++;
        }
        
        
        
        System.out.println(ans);
        
    }
}
