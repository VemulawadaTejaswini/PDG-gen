import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int alphaAns = 0;
        int betaAns = 0;
        for (int i = 0; i < num; i++) {
            String alpha = scan.next();
            String beta = scan.next();
            if (alpha.compareTo(beta) == 0) {
                alphaAns++;
                betaAns++;
            } else if (alpha.compareTo(beta) > 0) {                    
                alphaAns += 3;
            } else {
                betaAns += 3;
            }
        }
        out.printf("%d %d\n", alphaAns, betaAns);
    }
}