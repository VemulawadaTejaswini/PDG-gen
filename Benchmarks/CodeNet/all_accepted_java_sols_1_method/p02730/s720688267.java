import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isOk = true;
        StringBuilder sb = new StringBuilder(s);
        if (!s.equals(sb.reverse().toString())) {
            isOk = false;
        }
        String s2 = s.substring(0,(s.length()-1)/2);
        StringBuilder sb2 = new StringBuilder(s2);
        if (!s2.equals(sb2.reverse().toString())) {
            isOk = false;
        }
        String s3 = s.substring((s.length()+2)/2);
        StringBuilder sb3 = new StringBuilder(s3);
        if (!s3.equals(sb3.reverse().toString())) {
            isOk = false;
        }
        System.out.println(isOk?"Yes":"No");
    }
}
