import java.util.*;

public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = new char[s.length()];
        char d = c[0];
        int min = 100000;
        
        for (int i = 0; i < s.length(); i++) c[i] = s.charAt(i);
        int count = 0;
        for (int l = 0; l < s.length(); l++) {
            if (c[l] == c[0]) count++;
        }
        if (count == s.length()) {
            System.out.println(0);
        } else {
            for (int k = 0; k < s.length(); k++) {
                for (int i = 0; i < s.length(); i++) c[i] = s.charAt(i);
                for (int i = 0; i < s.length() - 1; i++) {
                    for (int j = 0; j < s.length() - i - 1; j++) {
                        if (c[j + 1] == c[k]) c[j] = c[k];
                    }
                    int a = 0;
                    for (int j = 0; j < s.length() - i - 1; j++) {
                        if (c[j] == c[k]) a++;
                    }
                    if (a == s.length() - 1 - i) {
                        if (i + 1 < min) {
                            min = i + 1;
                        }
                        break;
                    } else {
                        continue;
                    }
                }
            }
            System.out.println(min);
        }
    }    
}
