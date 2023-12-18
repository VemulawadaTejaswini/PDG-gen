import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();
        int AC = 0;
        int WA = 0;
        int TLE = 0;
        int RE = 0;

        for (int i=0; i < N; i++){
            String inputTmp = scan.nextLine();
            if (inputTmp.equals("AC")) {
                AC ++;
            }else if (inputTmp.equals("WA")){
                WA ++;
            }else if (inputTmp.equals("TLE")){
                TLE ++;
            }else if (inputTmp.equals("RE")){
                RE ++;
            }
        }

        System.out.println("AC x " + AC);
        System.out.println("WA x " + WA);
        System.out.println("TLE x " + TLE);
        System.out.println("RE x " + RE);
    }
}
