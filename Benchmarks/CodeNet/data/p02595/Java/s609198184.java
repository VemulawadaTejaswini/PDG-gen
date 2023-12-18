import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        long d = Long.parseLong(sc.next());
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            long x = Long.parseLong(sc.next());
            long y = Long.parseLong(sc.next());
            if(x*x + y*y <= d*d) ans++;
        }
    
        System.out.println(ans);
    }
}