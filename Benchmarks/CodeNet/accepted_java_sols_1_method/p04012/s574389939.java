import java.io.BufferedInputStream;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner s = new Scanner(new BufferedInputStream(System.in));
        String str = s.nextLine();
        int[] n = new int[26];
        for (int i = 0;i < str.length(); i++) {
            n[str.charAt(i) - 'a']++;
        }
        for (int i: n) {
            if ((i & 1 )== 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}