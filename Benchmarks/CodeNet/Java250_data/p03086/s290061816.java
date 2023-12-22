import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int len = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length; i++) {
            if(s[i].equals("A") || s[i].equals("C") || s[i].equals("G") || s[i].equals("T")) {
                sb.append(s[i]);
                if(i == s.length-1) {
                    if(sb.length() > len) {
                        len = sb.length();
                    }
                }
            }else {
                if(sb.length() > len) {
                    len = sb.length();
                    sb = new StringBuilder();
                }
            }
        }
        
        System.out.println(len);
    }
}