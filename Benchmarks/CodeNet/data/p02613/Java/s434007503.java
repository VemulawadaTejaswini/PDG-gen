import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();

        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;

        for(int i = 0; i < n; i++) {
            switch(sc.next()) {
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
                default:
                 break;
            }

        }

        System.out.println("AC x " + String.valueOf(ac));
        System.out.println("WA x " + String.valueOf(wa));
        System.out.println("TLE x " + String.valueOf(tle));
        System.out.println("RE x " + String.valueOf(re));
    }
}