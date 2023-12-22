import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        String[] sp = s.split("");
        int count = 0;
        int left = 0;
        for(int i=0; i<sp.length; i++) {
            if(sp[i].equals("(")) count++;
            else if(count == 0) left++;
            else count--;
        }
        
        
        String ans = "";
        for(int i=0; i<left; i++) {
            ans += "(";
        }
        ans += s;
        for(int i=0; i<count; i++) {
            ans += ")";
        }
        System.out.println(ans);
     }
}
