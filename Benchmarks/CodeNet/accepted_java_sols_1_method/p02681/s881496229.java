
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String S = sc.next();
    static String T = sc.next();

    public static void main(String[] args) {
        if (S.length() < 1 || S.length() > 10 || T.length() - S.length() != 1){
            System.out.println("No");
        } else {
            char strS[] = S.toCharArray();
            char strT[] = T.toCharArray();
            for (int i = 0; i < S.length(); i++){
                if (strS[i] != strT[i]) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
