import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = (sc.next());
        String t = (sc.next());
        String ans = "No";

        t = t.substring(0, t.length()-1);

        if (s.equals(t)) {
            ans = "Yes";
        }


        System.out.println(ans);
    }
}