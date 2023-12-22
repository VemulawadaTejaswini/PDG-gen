
import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        int T = N * A;
        if(T<B) {
        	ans = T;
        }else {
        	ans = B;
        }
        
        System.out.println(ans);
    }
}