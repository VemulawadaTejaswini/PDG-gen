import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] result = S.toCharArray();
        Arrays.sort(result);
        char comp = 0;
        boolean ans = false;
        boolean but = false;
        for (int i = 97; 123 > i; i++) {
            comp = (char) i;
            ans = false;
            for (int j = 0; S.length() > j; j++) {
                if (comp == result[j]) {
                    ans = true;
                    break;
                }
            }
            if (ans == false) {
                break;
            }
            but = true;
        }
        if (but == true && ans == true) {
            System.out.println("None");
        } else {
            System.out.println(comp);
        }
    }
}
