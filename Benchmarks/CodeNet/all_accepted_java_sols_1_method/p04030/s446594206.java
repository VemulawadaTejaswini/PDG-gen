import java.util.Scanner;

/**
 * ABC043B
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '0') {
                ans.append('0');
            } else if (c == '1') {
                ans.append('1');
            } else if (c == 'B') {
                if (ans.length() != 0) {
                    ans.deleteCharAt(ans.length() - 1);                    
                }
            }
        }

        System.out.println(ans.toString());
        sc.close();
    }
}