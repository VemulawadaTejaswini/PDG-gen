import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        String s = sc.next();
        String t = sc.next();

        if (s.length() <= 10 && s.length() + 1 == t.length() && s.equals(t.substring(0, s.length()))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
