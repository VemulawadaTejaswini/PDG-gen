import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counterAC = 0;
        int counterWA = 0;
        int counterTLE = 0;
        int counterRE = 0;
        for(int i = 0; i < N; i ++){
                    String S = sc.next();
                    if(S.equals("AC")){
                        counterAC++;
                    }else if(S.equals("WA")){
                        counterWA++;
                    }else if(S.equals("TLE")){
                        counterTLE++;
                    }else if(S.equals("RE")){
                        counterRE++;
                    }
            }
            System.out.println("AC x " + counterAC);
            System.out.println("WA x " + counterWA);
            System.out.println("TLE x " + counterTLE);
            System.out.println("RE x " + counterRE);
    }
}
