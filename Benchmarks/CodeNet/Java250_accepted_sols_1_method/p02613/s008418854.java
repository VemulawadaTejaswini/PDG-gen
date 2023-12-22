import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int varN = Integer.parseInt(sc.next());
        int acCnt = 0;
        int waCnt = 0;
        int tleCnt = 0;
        int reCnt = 0;

        for (int i = 0; i < varN; i++) {
            switch (sc.next()) {
                case "AC":
                    acCnt++;
                    break;
                case "WA":
                    waCnt++;
                    break;
                case "TLE":
                    tleCnt++;
                    break;
                case "RE":
                    reCnt++;
                    break;
            }
        }
        sc.close();

        System.out.println("AC x " + acCnt);
        System.out.println("WA x " + waCnt);
        System.out.println("TLE x " + tleCnt);
        System.out.println("RE x " + reCnt);
    }
}