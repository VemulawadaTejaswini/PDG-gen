import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        sc.close();

        boolean isOK = true;
        for (int i = 0; i < S.length(); i++) {
            char sVal = S.charAt(i);
            char tVal = T.charAt(i);
            if (sVal != tVal) {
                isOK = false;
                break;
            }
        }

        if (isOK) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
