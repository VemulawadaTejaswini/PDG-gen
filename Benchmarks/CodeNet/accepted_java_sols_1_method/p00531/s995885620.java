
import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int kihon = scan.nextInt();
        int zyougen = scan.nextInt();
        int tuika = scan.nextInt();
        int joi = scan.nextInt();
        int ryokin = x * joi;
        int hikaku = 0;

        if (zyougen >= joi) {
            if (ryokin > kihon) {
                ryokin = kihon;
                System.out.println(kihon);
            } else {
                System.out.println(ryokin);
            }
        } else {
            hikaku = kihon + (joi - zyougen) * tuika;
            if (hikaku > ryokin) {
                System.out.println(ryokin);
               
            }else
                System.out.println(hikaku);
        }
    }
}

