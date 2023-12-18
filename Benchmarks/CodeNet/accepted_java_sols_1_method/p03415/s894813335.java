import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s0 = sc.next(), s1 = sc.next(), s2 = sc.next();
        String ans = String.valueOf(s0.charAt(0)) + String.valueOf(s1.charAt(1)) + String.valueOf(s2.charAt(2));
        System.out.println(ans);
        sc.close();
    }
}