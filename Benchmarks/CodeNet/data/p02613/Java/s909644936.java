import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;

        for (int i=0; i<n; i++) {

            String s = scan.next();

            switch (s) {
                case "AC":
                    ac++;
                    break;
                case "WA":
                    wa++;
                    break;
                case "TLE":
                    tle++;
                    break;
                case "RE":
                    re++;
                    break;
            }
        }

        String output = String.format("AC x %d\nWA x %d\nTLE x %d\nRE x %d", ac, wa, tle, re);

        System.out.print(output);
    }


}