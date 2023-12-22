import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] check = new int[N];
        int[] ans = new int[N];
        
        boolean hantei = true;
        
        for(int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            
            if(check[s-1] == 0) {
                check[s-1] = 1;
                ans[s-1] = c;
            }else if(check[s-1] == 1 && ans[s-1] == c) {

            }else {
                hantei = false;
                break;
            }
            
        }
        
        if(N > 1 && ans[0] == 0 && check[0] == 1) {
            hantei = false;
        } else if(N > 1 && ans[0] == 0 && check[0] == 0) {
            ans[0] = 1;
        }
        
        int num = 0;
        if(hantei) {
            for(int i = 0; i < N; i++) {
                num *= 10;
                num += ans[i];
            }
            System.out.println(num);
        }else {
            System.out.println(-1);
        }
    }
}