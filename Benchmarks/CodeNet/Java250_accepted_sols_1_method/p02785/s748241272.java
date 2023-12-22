import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] H = new int [N];
        long ans = 0;
        
        for(int i=0; i<N; i++){
            H[i] = sc.nextInt();
        }
        
        Arrays.sort(H);
        
        for(int i=H.length-K-1; i>=0; i--){
            ans+=H[i];
        }
        
        System.out.println(ans);
    }
}
