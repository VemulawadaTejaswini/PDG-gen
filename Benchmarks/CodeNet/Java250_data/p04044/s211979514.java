import java.util.*;
public class Main {
    
    // Normal problem about sorting
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int NOC = sc.nextInt(), L = sc.nextInt(), i = 0;
        String[] s = new String[NOC];
        while(NOC-->0) s[i++] = sc.next();
        Arrays.sort(s);
        for(String a: s) System.out.print(a);
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}