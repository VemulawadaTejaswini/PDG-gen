import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int AC=0;
        int WA=0;
        int TLE=0;
        int RE=0;
        for (int i = 0; i < N; i++) {
            String S = scanner.next();
            if(S.equals("AC")){
                AC++;
            } else if(S.equals("WA")){
                WA++;
            } else if(S.equals("TLE")){
                TLE++;
            } else if(S.equals("RE")){
                RE++;
            }
        }
        System.out.println("AC x " + AC);
        System.out.println("WA x " + WA);
        System.out.println("TLE x " + TLE);
        System.out.println("RE x " + RE);
    }

    public static void main(String[] args){
        new Main();
    }
}
