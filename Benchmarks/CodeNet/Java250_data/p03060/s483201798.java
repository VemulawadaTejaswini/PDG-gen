import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++) v[i] = scan.nextInt();
        for(int i = 0; i < n; i++) c[i] = scan.nextInt();
        int out = -100;
        for(int i = 0; i < 1 << n; i++){
            int x = 0;
            int y = 0;
            for(int j = 0; j < n; j++){
                if(((i >> j) & 1) == 1){
                    x += v[j];
                    y += c[j];
                }
            }
            if(out < x - y) out = x - y;
        }
        System.out.println(out);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}