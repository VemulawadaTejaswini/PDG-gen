import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        do {
            String result = sc.next();
            switch(result) {
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
        }while(sc.hasNext());

        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);
    }

}