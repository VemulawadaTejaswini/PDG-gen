import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int m[] = new int[N];
        int total = 0;
        
        for(int i = 0; i < N; i++){
            m[i] = sc.nextInt();
            total += m[i];
        }
        int d = X - total;
        int ans = 0;
        int min = m[0];
        for(int i = 0; i < N; i++){
            if(min > m[i]){
                min = m[i];
            }
        }
        ans = N + d / min;
        System.out.println(ans);
    }
}
