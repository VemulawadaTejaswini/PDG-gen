import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int sLen = S.length();
        int oneLen = S.replaceAll("0", "").length();
        int zeroLen = sLen - oneLen;
        int r = Math.min(zeroLen, oneLen) * 2;
        System.out.println(r);
    }
}