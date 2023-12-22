import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int K = sc.nextInt();
        
        int ans;
        
        if(K<=A){
            ans = K;
        } else if(K<=A+B){
            ans = A;
        } else {
            ans = A - (K-(A+B));
        }
        
        
        System.out.println(ans);
    }
}
