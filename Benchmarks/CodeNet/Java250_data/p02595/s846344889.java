import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int out = 0;
        for(int i = 0; i < n; i++){
            long x = scan.nextInt();
            long y = scan.nextInt();
            double distance = Math.sqrt(x * x + y * y);
            if(distance <= d) out++;
        }
        System.out.println(out);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}