import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String ans = S.charAt(0) + String.valueOf((S.length()-2)) + S.charAt(S.length()-1);
        System.out.println(ans);
    }
}