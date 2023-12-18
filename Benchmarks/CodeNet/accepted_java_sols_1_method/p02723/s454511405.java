import java.util.*;
public class Main {
    static final long MODVAL = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
//        System.out.println(S.charAt(3));
        boolean flag = (S.charAt(2) == S.charAt(3)) && (S.charAt(4) == S.charAt(5));
        System.out.println(flag ? "Yes" : "No");
    }
}
