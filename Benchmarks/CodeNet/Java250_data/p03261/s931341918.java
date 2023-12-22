import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        boolean ans = true;

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            for (int j = 0; j < i; j++) {
                if (words[j].equals(words[i])) {
                    ans = false;
                    break;
                }
            }

            if (i > 0) {
                char a = words[i].charAt(0);
                char b = words[i - 1].charAt(words[i - 1].length() - 1);

                if (a != b) {
                    ans = false;
                    //System.out.println("---");
                    //System.out.println(i + ", " + a + ", " + b);
                }
            }
            if (!ans) {
                break;
            }
        }
        System.out.println(ans ? "Yes":"No");
    }
}
