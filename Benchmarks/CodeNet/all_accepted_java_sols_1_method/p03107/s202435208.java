import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int idx = 0;
        int count = 0;

        while (idx < sb.length()-1) {
            if (sb.charAt(idx) != sb.charAt(idx+1)) {
                count += 2;
                sb.deleteCharAt(idx+1);
                sb.deleteCharAt(idx);
                if (idx != 0) idx--;
            } else {
                idx++;
            }
        }
        System.out.println(count);
    }
}