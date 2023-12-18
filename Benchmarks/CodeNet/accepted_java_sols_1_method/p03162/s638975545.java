import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] HappinessSelectA = new int[n];
        int[] HappinessSelectB = new int[n];
        int[] HappinessSelectC = new int[n];

        for (int i = 0; i < n; i++) {
            HappinessSelectA[i] = sc.nextInt();
            HappinessSelectB[i] = sc.nextInt();
            HappinessSelectC[i] = sc.nextInt();
        }
        int[][] HappinessSum = new int[3][n];
        HappinessSum[0][0] = HappinessSelectA[0];
        HappinessSum[1][0] = HappinessSelectB[0];
        HappinessSum[2][0] = HappinessSelectC[0];
        for (int i = 1; i < n; i++) {
            HappinessSum[0][i] = Math.max(HappinessSum[1][i-1], HappinessSum[2][i-1])
                                    + HappinessSelectA[i];
            HappinessSum[1][i] = Math.max(HappinessSum[0][i-1], HappinessSum[2][i-1])
                                    + HappinessSelectB[i];
            HappinessSum[2][i] = Math.max(HappinessSum[1][i-1], HappinessSum[0][i-1])
                                    + HappinessSelectC[i];
        }

        int MaxHappiness = HappinessSum[0][n-1];
        if (HappinessSum[1][n-1] > MaxHappiness) {
            MaxHappiness = HappinessSum[1][n-1];
        }
        if (HappinessSum[2][n-1] > MaxHappiness) {
            MaxHappiness = HappinessSum[2][n-1];
        }

        System.out.println(MaxHappiness);

        sc.close();
    }
}
