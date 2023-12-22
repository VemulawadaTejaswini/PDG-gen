import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] arr = new String[n];
        char last = ' ';
        char first = ' ';
        boolean f = true;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            first = str.charAt(0);
            if (i != 0 && (first != last || Arrays.asList(arr).contains(str))) {
                f = false;
                break;
            }
            last = str.charAt(str.length() - 1);
            arr[i] = str;

        }
        if (f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}