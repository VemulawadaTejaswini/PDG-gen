import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int acCnt = 0;
        int waCnt = 0;
        int tleCnt = 0;
        int reCnt = 0;
        for (int i = 0; i < n; i++) {
            String result = sc.next();
            switch (result) {
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
                default:

            }
        }
        sc.close();
        System.out.println("AC x " + String.valueOf(acCnt));
        System.out.println("WA x " + String.valueOf(waCnt));
        System.out.println("TLE x " + String.valueOf(tleCnt));
        System.out.println("RE x " + String.valueOf(reCnt));
    }
}
