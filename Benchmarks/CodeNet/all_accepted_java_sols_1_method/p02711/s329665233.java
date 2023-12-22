import java.util.*;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '7') {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

    }
}
