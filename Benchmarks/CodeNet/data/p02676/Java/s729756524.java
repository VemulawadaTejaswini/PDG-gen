import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        String s = in.next();
        System.out.println(s.length() > K ? s.substring(0, K) + "..." : s);
    }
}