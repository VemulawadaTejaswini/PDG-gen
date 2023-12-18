import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int l, r;
        int sit = 0;
 
        for(int i = 0; i < N; i++){
            l = sc.nextInt();
            r = sc.nextInt();
            sit = sit + r - l + 1;
        }
 
        System.out.println(sit);
        
    }
}