import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S = scn.next();
        String T = scn.next();

        int countOp = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != T.charAt(i)) {
                countOp++;
            }
        }
        System.out.println(countOp);

    }
}
