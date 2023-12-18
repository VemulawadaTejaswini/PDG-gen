import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int t[] = new int[N];
        int total =  0;
        for (int i = 0; i < N; ++i){
            t[i] = sc.nextInt();
        }
        for (int i = 0; i < N-1; ++i){
            total += Math.min(T,t[i+1]-t[i]);
        }
        
        total += T; 
        
        System.out.println(total);
        
    }
}