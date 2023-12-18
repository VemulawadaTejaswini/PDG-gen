import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] l = new int[N];
        int[] r = new int[N];
        int sit = 0;
        
        for(int i = 0; i < N; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            sit = sit + (r[i] - l[i] + 1);
        }
 
        System.out.println(sit);
        
    }
}