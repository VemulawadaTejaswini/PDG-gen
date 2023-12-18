import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int D = 0;
        int cnt = 1;
        for(int i=0; i<N; i++){
            D += sc.nextInt();
            if(D > X)   break;
            cnt++;
        }
        
        System.out.println(cnt);
    }
}
