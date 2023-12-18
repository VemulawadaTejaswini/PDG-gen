import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int AC = 0;
        int WA = 0;
        int TLE = 0;
        int RE = 0;

        for (int i = 0; i < n; i++) {
            String check;
            check = scn.next();
            switch (check) {
                case "AC":
                    AC += 1;
                    break;
                case "WA":
                    WA += 1;
                    break;
                case "TLE":
                    TLE += 1;
                    break;
                default:
                    RE += 1;
                    break;
            }
        }

        System.out.println("AC × " + AC);
        System.out.println("WA × " + WA);
        System.out.println("TLE × " + TLE);
        System.out.println("RE × " + RE);


        scn.close();

    }


}