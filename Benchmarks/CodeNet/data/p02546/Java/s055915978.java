import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.print(s);
        System.out.println(s.charAt(s.length() - 1) == 's' ? "es" : "s");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
