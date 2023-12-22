import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        
        int K = sc.nextInt();
        
        int cnt = 0;
        
        int [] nums =new int [100002];
        
        for (int i = 0; i < N; i++){
        
            nums[i] = sc.nextInt();
        
        }
        
        sc.close();

        for (int i = 0; i < N; i++){
            
            if (nums[i] >= K) {
                cnt++;
            
            }
        }

        System.out.println(cnt);


        
    }
}