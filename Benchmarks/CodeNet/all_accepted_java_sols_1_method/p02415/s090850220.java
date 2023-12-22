import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            String s = sc.next();
            int l = s.length();
            for (int i = 0;i < l;i++) {
                char c = s.charAt(i);
                if ('a' <= c && c <= 'z') {
                    c -= 32;
                } else if ('A' <= c && c <= 'Z') {
                    c += 32;
                }
                sb.append(c);
            }
            sb.append(' ');
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}

