import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        
        double pos = 0;
        for (int i = 1; i <= n; i++) {
            if (i >= k) {
                pos +=  ((double)1 / (double)n) * (double)(n - i + 1);
                break;
            } else {
                int times = 0;
                int diceNum = i;
                while (diceNum < k) {
                    times++;
                    diceNum = diceNum * 2;
                }
                pos += ((double)1 / (double)n) * (double)Math.pow(0.5, times);
            }
        } 
        System.out.println(pos);
    }
}
