import java.util.*;
 
class Prg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t;
        String ans = "";
        for(long i = 1;; i++){
            t = sc.nextInt();
            if(t == 0) break;
            ans += "Case " + i + ": " + t + "\n";
        }
        System.out.println(ans);
    }
}