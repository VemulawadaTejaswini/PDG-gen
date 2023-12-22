import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) h[i] = scan.nextInt();
        int c = 0;
        int out = -1;
        for(int i = 0; i < n - 1; i++){
            if(h[i] >= h[i + 1]) c++;
            else{
                if(c == 0) continue;
                out = Math.max(c, out);
                c = 0;
            }
        }
        out = Math.max(out, c);
        System.out.println(out);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}