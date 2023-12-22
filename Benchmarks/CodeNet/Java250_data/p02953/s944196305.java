import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] H = new long[N];
        long rem = 0;
        boolean result = true;
        
        for(int i = 0; i < N; i++){
            H[i] = sc.nextLong();
            if(i == 0)continue;
            if(H[i] < rem - 1){
                result = false;
                break;
            }
            
            if(H[i-1] == H[i] + 1){
                rem = H[i-1];
            }else if(H[i-1] > H[i]){
                result = false;
                break;
            }
            
        }
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
