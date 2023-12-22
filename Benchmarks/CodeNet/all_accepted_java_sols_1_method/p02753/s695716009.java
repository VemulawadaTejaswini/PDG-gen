import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean hasA = false;
        boolean hasB = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                hasA = true;
            }
            if (s.charAt(i) == 'B') {
                hasB = true;
            }
        }
        System.out.println(hasA&&hasB ? "Yes" : "No");
    }
}
