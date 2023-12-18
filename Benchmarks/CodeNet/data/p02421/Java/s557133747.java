import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int alphaAns = 0;
        int betaAns = 0;
        for (int i = 0; i < num; i++) {
            int alpha = scan.next().length();
            int beta = scan.next().length();
            if (alpha == beta) {
                alphaAns++;
                betaAns++;
            } else if (alpha > beta) {
                alphaAns += 3;
            } else {                                                   
                betaAns += 3;
            }
        }
        out.printf("%d : %d\n", alphaAns, betaAns);
    }
}