import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int n = s.length();
        int m = t.length();
        int min = 1001;
        for(int i = 0; i < n - m + 1; i++){
            int out = 0;
            if(s.substring(i, i + m).equals(t)){
                System.out.println(0);
                return;
            }
            for(int j = i; j < i + m; j++){
                if(s.charAt(j) != t.charAt(j - i)) out++;
            }
            min = Math.min(out, min);
        }
        System.out.println(min);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
