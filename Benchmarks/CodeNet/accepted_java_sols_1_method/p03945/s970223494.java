import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char tmp = S.charAt(0);
        long count = 0;
        for (char c : S.toCharArray()) {
            if (c != tmp) {
                tmp = c;
                count++;
            }
        }
        System.out.println(count);
    }
}
