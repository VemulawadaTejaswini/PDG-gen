import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int numTest = Integer.parseInt(stdIn.next());

        int numAC = 0;
        int numWA = 0;
        int numTLE = 0;
        int numRE = 0;
        for (int i = 0; i < numTest; i++) {
            String result = stdIn.next();
            if ("AC".equals(result)) {
                numAC++;
            } else if ("WA".equals(result)) {
                numWA++;
            } else if ("TLE".equals(result)) {
                numTLE++;
            } else if ("RE".equals(result)) {
                numRE++;
            }
        }
        System.out.println("AC x "+ numAC);
        System.out.println("WA x "+ numWA);
        System.out.println("TLE x "+ numTLE);
        System.out.println("RE x "+ numRE);
        stdIn.close();
    }

}