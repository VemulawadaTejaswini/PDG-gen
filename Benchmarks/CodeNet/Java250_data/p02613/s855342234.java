import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int countAC = 0;
        int countWA = 0;
        int countTLE = 0;
        int countRE = 0;
         for (int i = 0; i < num; i++) {
            String str = sc.next();
            switch(str) {
                case "AC":
                    countAC++;
                    break;
                case "WA":
                    countWA++;
                    break;
                case "TLE":
                    countTLE++;
                    break;
                case "RE":
                    countRE++;
                    break;
            }
        }
        System.out.println("AC x " + countAC);
        System.out.println("WA x " + countWA);
        System.out.println("TLE x " + countTLE);
        System.out.println("RE x " + countRE);

    }
}