import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int baseLength = S.length();
        int zeroWord = baseLength - S.replaceAll("0", "").length();
        int oneWord = baseLength - S.replaceAll("1", "").length();

        if (zeroWord > oneWord) {
            System.out.println(oneWord*2);
        }
        else {
            System.out.println(zeroWord*2);
        }
    }
}