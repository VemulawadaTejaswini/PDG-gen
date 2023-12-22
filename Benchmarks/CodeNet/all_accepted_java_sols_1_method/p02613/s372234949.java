import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countAC = 0;
        int countWA = 0;
        int countTLE = 0;
        int countRE = 0;

        for (int i=0; i<n; i++) {
            String s = sc.next();
            if(s.equals("AC")) {
                countAC++;
            } else if(s.equals("WA")) {
                countWA++;
            } else if(s.equals("TLE")) {
                countTLE++;
            } else if(s.equals("RE")) {
                countRE++;
            }
        }
        System.out.print("AC x " + countAC);
        System.out.print("\n");
        System.out.print("WA x " + countWA);
        System.out.print("\n");
        System.out.print("TLE x " + countTLE);
        System.out.print("\n");
        System.out.print("RE x " + countRE);
        System.out.print("\n");

    }

}