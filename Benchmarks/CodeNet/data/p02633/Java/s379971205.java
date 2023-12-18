import java.util.*;
public class Main {
    
    // Euclid's algorithm
    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((360/GCD(n,360)));
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}