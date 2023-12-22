import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'A' 
            && s.charAt(i) != 'C'
            && s.charAt(i) != 'G'
            && s.charAt(i) != 'T') {
                continue;
            }
            if (s.substring(i).matches("[ACGT]*")) {
                len = Math.max(len, s.substring(i).length());
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (s.substring(i, j).matches("[ACGT]*")) {
                    len = Math.max(len, s.substring(i, j).length());
                }
            }
        }
        System.out.println(len);
        sc.close();
    }
}