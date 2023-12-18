import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String s2 = in.next();
        char[] arr = s2.toCharArray();
        String res = "";
        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i];
        }
        if (s.equals(res)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}