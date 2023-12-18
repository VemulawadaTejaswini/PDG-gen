import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        
        long ans = Long.MIN_VALUE;
        ans = Math.max(a*c, ans);
        ans = Math.max(b*d, ans);
        if(b < 0){
            ans = Math.max(b*c, ans);
        }
        if(d < 0){
            ans = Math.max(a*d, ans);
        }
        System.out.println(ans);
    }
}