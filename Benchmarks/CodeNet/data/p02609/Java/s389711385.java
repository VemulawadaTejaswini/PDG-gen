import java.util.*;
public class Main {
    
    static int f(String s){
        int v = Integer.parseInt(s,2);
        int count = 0;
        while(v>0){
            int d = Integer.bitCount(v);
            v=(v%d);
            count++;
        }
        return count;
    }
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int NOC = sc.nextInt();
        StringBuilder s = new StringBuilder(sc.next());
        for(int i=0; i<NOC; i++) {
            s.setCharAt(i,(s.charAt(i)=='1') ? '0' : '1');
            System.out.println(f(s.toString()));
            s.setCharAt(i,(s.charAt(i)=='1') ? '0' : '1');
        }
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}
