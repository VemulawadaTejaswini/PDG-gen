import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) h[i] = scan.nextInt();
        int out = 0;
        int max = -1;
        for(int i = 1; i < n; i++){
            if(h[i - 1] >= h[i]){
                out++;
            }else{
                max = Math.max(max, out);
                out = 0;
            }
        }
        System.out.println(Math.max(max, out));
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
