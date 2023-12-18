import java.util.*;

public class Main {
    private static String JOI = "JOI";
    private static String IOI = "IOI";

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            String str = null;
            while (scn.hasNext()) {
                str = scn.next();

                int joi = 0;
                for (int i = 0; (i = str.indexOf(JOI, i) + 1) > 0; joi++);
                System.out.println(joi);

                int ioi = 0;
                for (int i = 0; (i = str.indexOf(IOI, i) + 1) > 0; ioi++);
                System.out.println(ioi);
            }
        }
    }
}