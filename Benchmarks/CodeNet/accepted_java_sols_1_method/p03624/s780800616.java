import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char ans = 'a';
        boolean found = false;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == c) {
                    found = true;
                    break;
                }
                if (i == a.length - 1 && !found) {
                    ans = c;
                    System.out.println(ans);
                    return;
                }
            }
            found = false;
        }
        System.out.println("None");
    }
}
