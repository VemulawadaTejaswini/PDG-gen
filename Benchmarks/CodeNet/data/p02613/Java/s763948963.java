import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        int countAC = 0;
        int countWA = 0;
        int countTLE = 0;
        int countRE = 0;
        for(int i=0; i < N; i++){
            S[i] = sc.next();
            if("AC".equals(S[i])){
                countAC ++;
            }else if("WA".equals(S[i])){
                countWA ++;
            }else if("TLE".equals(S[i])){
                countTLE ++;
            }else if("RE".equals(S[i])){
                countRE ++;
            }
        }
        sc.close();

        System.out.println("AC x "+ countAC);
        System.out.println("WA x "+ countWA);
        System.out.println("TLE x "+ countTLE);
        System.out.println("RE x "+ countRE);
    }
}