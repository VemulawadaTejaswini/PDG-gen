import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String judge;
        int countAC = 0;
        int countWA = 0;
        int countTLE = 0;
        int countRE = 0;
        for (int i = 0; i < n; i++) {
            judge = sc.next();
            
            if (judge.equals("AC")) {
                countAC++;
            } else if (judge.equals("WA")) {
                countWA++;
            } else if (judge.equals("TLE")) {
                countTLE++;
            } else if (judge.equals("RE")) {
                countRE++;
            }
        }
        
        System.out.println("AC x " + countAC);
        System.out.println("WA x " + countWA);
        System.out.println("TLE x " + countTLE);
        System.out.println("RE x " + countRE);
    }
}