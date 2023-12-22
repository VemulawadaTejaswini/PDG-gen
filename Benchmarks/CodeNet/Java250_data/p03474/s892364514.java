import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String ans = "No";
        String S = sc.next();
        String[] s;
        try {
            s = S.split("-");
            if(s.length == 2) {
                if(s[0].length() == a && s[1].length() == b) {
                    ans = "Yes";
                } 
            }
            System.out.println(ans);
        }catch(Exception e) {
            System.out.println(ans);
        }
    }

}
