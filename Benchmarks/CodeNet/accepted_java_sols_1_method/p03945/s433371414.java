import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char status = s.charAt(0);

        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (status != s.charAt(i)) {
                count++;
                status = s.charAt(i);
            }
        }
        System.out.println(count);
    }
}
