import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder n = new StringBuilder(sc.next());

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1') {
                n.setCharAt(i, '9');
            } else if(n.charAt(i) == '9') {
                n.setCharAt(i, '1');
            }
        }

        System.out.println(n);
    }
}
