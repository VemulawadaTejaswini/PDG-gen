import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        
        double nearest = Double.MAX_VALUE;
        int ans = 0;
        for(int i = 1; i <= N; i++){
            int H = sc.nextInt();
            double avg = T - H * 0.006;
            
            if( nearest > Math.abs(A - avg) ){
                nearest = Math.abs(A - avg);
                ans = i;
            }
        }
        
        System.out.println(ans);
        
    }
}
