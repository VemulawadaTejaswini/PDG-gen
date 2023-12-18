import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.length() < t.length()) {
            System.out.println("UNRESTORABLE");
            return;
        }
        int idx = -1;
        for (int i = 0; i <= s.length() - t.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) == '?') {
                    continue;
                }
                if (s.charAt(i + j) != t.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.println("UNRESTORABLE");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i >= idx && i < idx + t.length()) {
                sb.append(t.charAt(i - idx));
            } else if (s.charAt(i) == '?'){
                sb.append('a');
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}