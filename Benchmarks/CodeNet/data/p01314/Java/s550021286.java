import java.util.Scanner;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);
    static int[] answerTable = new int[1001];
    
    public static void main(String[] args) {
        for (int i = 1; i <= 499; i++) {
            for (int j = i + 1; j <= 500; j++) {
                int sum = (i + j) * (j - i + 1) / 2;
                if (sum <= 1000) {
                    answerTable[sum]++;
                }
            }
        }

        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                solve(n);
            }
        }
    }
    
    public static void solve(int n) {
        System.out.println(answerTable[n]);
    }
}