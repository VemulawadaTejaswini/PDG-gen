import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int loopcount = scan.nextInt();
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;

        for(int i = 0; i < loopcount; i++){
            switch(scan.next()){
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
        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);
    }
}
