import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] H = new long[N];
        H[0] = sc.nextLong();
        int max = 0;
        int count = 0;
        for(int i = 1; i < N; i++) {
            H[i] = sc.nextLong();
            if(H[i-1] >= H[i]) {
                count++;
            }else {
                if(max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        
        if(count > max) {
            max = count;
        }
        
        System.out.println(max);
        
        
    }
}