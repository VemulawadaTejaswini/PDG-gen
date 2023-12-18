import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] s_char = s.toCharArray();
        Arrays.sort(s_char);
        String s_asc = new String(s_char);

        String t = sc.next();
        char[] t_char = t.toCharArray();
        Arrays.sort(t_char);
        String t_asc = new String(t_char);
        String t_desc = new StringBuilder(t_asc).reverse().toString();
        
        if (s_asc.compareTo(t_desc) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
