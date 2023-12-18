import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();        
        String t = sc.next();
        String t2 = t.substring(0, t.length()-1);
        if (t2.equals(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}